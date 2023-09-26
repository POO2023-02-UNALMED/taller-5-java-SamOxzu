package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona zona;
	
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
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getGenero() {
		return genero;
	}
}
