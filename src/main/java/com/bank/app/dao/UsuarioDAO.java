package com.bank.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.app.model.Usuario;

@Repository
public class UsuarioDAO {

	@Autowired
	private DataSource dataSource;

	public Long createUser(Usuario user) {
		
		String createQuery = "INSERT INTO usuario( nombre, primer_apellido, segundo_apellido, email, numero_cuenta ) VALUES(?,?,?,?,?)";

		/**
		 * Let's use a try-with-resources statement in order to close automatically the
		 * DataBase Connection (Java 7 Feature)
		 **/
		try (Connection connection = dataSource.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(createQuery, Statement.RETURN_GENERATED_KEYS)) {

			preparedStatement.setString(1, user.getNombre());
			preparedStatement.setString(2, user.getPrimerApellido() );
			preparedStatement.setString(3, user.getSegundoApellido());
			preparedStatement.setString(4, user.getEmail() );
			preparedStatement.setBigDecimal(5, user.getNumeroCuenta() );

			if ( preparedStatement.executeUpdate() > 0 ) {
				try ( ResultSet generatedKeys = preparedStatement.getGeneratedKeys() ) {
					if ( generatedKeys.next() ) {
						return generatedKeys.getLong(1);
					}
					throw new SQLException("La recuperación del id del Alumno falló");
				}
			} else {
				throw new SQLException("Ocurrió un error al crear nuevo Alumno");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Ocurrió un error al crear nuevo Alumno");
		}

	}

}
