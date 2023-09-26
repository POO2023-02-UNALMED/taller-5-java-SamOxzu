package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal{
	private static Mamifero [] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public int cantidadMamiferos() {
		return 1;
	}
	
	public void crearCaballo() {
		
	}
	
	public void crearLeon() {
		
	}
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.Edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
}
