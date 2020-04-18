package com.carloz.curso.jdbc.conexion01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		System.out.println("this is  a test with DB");

		String cadenaConexion = "jdbc:mysql://127.0.0.1:3311/curso";
		try (Connection conexion = DriverManager.getConnection(cadenaConexion, "root", "root");
				Statement sentencia = conexion.createStatement();) {
			sentencia.executeUpdate("insert into persona(nombre, apellidos,edad) values ('pepe','tres',24)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("second line...");
	}

}
