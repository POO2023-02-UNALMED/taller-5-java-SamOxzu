package gestion;

import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas;
	
	public void agregarZonas() {
		
	}
	
	public int cantidadTotalAnimales() {
		return 1;
	}
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion, List<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
}
