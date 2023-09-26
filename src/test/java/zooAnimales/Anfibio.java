package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{
	private Anfibio [] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public static int cantidadAnfibios() {
		return 1;
	}
	
	public static void crearRana() {
		
	}
	
	public static void crearSalamandra() {
		
	}
	
	public String movimiento() {
		return "a";
	}
	
	public Anfibio() {
		
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
}
