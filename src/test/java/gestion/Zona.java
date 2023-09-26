package gestion;

import java.util.List;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales;
	
	public void agregarAnimales() {
		
	}
	
	public int cantidadAnimales() {
		return 1;
	}
	
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
	public String getNombre() {
		return nombre;
	}
}
