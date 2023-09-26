package zooAnimales;

public class Pez extends Animal{
	private static Pez [] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public static int cantidadPeces() {
		return 1;
	}
	
	public static void crearSalmon() {
		
	}
	
	public static void crearBacalao() {
		
	}
	
	public String movimiento() {
		return "a";
	}
}
