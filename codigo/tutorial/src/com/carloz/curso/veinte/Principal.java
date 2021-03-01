package com.carloz.curso.veinte;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("example for inehrance");
		Persona p1 = new Persona("juaco");

		System.out.println(p1.toString());

		Empleado e1 = new Empleado("Juan", 7700);

		System.out.println(e1.toString());


		System.out.println("OK");


	}

}
