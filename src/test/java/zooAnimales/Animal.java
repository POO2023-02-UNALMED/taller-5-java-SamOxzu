package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int Edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public String movimiento() {
		return "a";
	}
	
	public int totalPorTipo() {
		return 1;
	}
	
	public String toString() {
		return "a";
	}
	
	public Animal() {
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.Edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
}
