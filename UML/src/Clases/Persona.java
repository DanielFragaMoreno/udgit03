package Clases;

public class Persona {
	
	//Atributos privados
	private String nombre;
	private int edad;
	
	//Construcor con parametros de entrada.
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters and Setters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
		
		}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
