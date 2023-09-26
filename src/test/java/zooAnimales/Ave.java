package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	private Ave [] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public static int cantidadAves() {
		return 1;
	}
	
	public static void crearHalcon() {
		
	}
	
	public static void crearAguila() {
		
	}
	
	public String movimiento() {
		return "a";
	}
	
	public Ave() {
		
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
}
