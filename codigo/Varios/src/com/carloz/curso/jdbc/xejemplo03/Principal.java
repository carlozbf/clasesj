package com.carloz.curso.jdbc.xejemplo03;

//Consultas parametrizadas osea con ? para el plan de ejecucion de DB

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://127.0.0.1:3311/curso";
		try (Connection conexion = DriverManager.getConnection(cadenaConexion, "root", "root");
				//PreparedStatement sentencia = conexion.prepareStatement("select * from persona where nombre=?");
				PreparedStatement sentencia =generarConsultaParametrizada("select * from persona where nombre=?","pepe",conexion);
				ResultSet rs = sentencia.executeQuery();
				
				) {
			while(rs.next()){
				System.out.print(rs.getString("nombre"));
				System.out.print(" " + rs.getString("apellidos"));
				System.out.println(" " + rs.getString("edad"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static PreparedStatement generarConsultaParametrizada(String sql, String nombre, Connection conexion) throws SQLException {
		PreparedStatement consultaParametrizada = conexion.prepareStatement(sql);
		consultaParametrizada.setString(1, nombre);
		return consultaParametrizada;
		
	}

}
