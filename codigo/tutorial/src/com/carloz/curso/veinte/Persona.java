package com.carloz.curso.veinte;


public class Persona {

	private String nombre;
	private String apellido;
	private String edad;
	private int idPersona;
	public static int contadorPersonas;

	public Persona(){
		idPersona = ++contadorPersonas;
	}

	public Persona (String nombre){
		this(); // para que invoque el contructor nomarl y haga la suma
		this.nombre = nombre;
	}



	@Override
	public String toString(){
		return  "id" + idPersona + " Nombre: " + this.nombre;
	}

	
}
