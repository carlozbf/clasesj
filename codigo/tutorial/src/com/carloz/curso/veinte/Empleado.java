package com.carloz.curso.veinte;


public class Empleado extends Persona {

	private double sueldo;

	public Empleado(String nombre, double sueldo){
		super(nombre);
		this.sueldo = sueldo;
	}

	@Override
	public String toString(){
		return super.toString() + " el sueldo: " + sueldo;
	}




	
}
