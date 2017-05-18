package tarea1;

import java.util.ArrayList;

public class Receta {

	private String nombre;
	private String ingredientes;
	private ArrayList<String> preparacion;
	
	public Receta() {
		
	}

	public Receta(String nombre, String ingredientes, ArrayList<String> preparacion) {
	
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
}
