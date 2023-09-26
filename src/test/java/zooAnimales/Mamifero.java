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
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
}
