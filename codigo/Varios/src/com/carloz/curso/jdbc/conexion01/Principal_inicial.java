package com.carloz.curso.jdbc.conexion01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal_inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is  a test with DB");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String cadenaConexion = "jdbc:mysql://127.0.0.1:3311/curso";
			Connection conexion=DriverManager.getConnection(cadenaConexion,"root","root");
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("insert into persona(nombre, apellidos,edad) values ('pepe','juaco',22)");
			sentencia.close();
			conexion.close();
			
			
			System.out.println("second line...");			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
