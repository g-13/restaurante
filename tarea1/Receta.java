package tarea1;

import java.util.ArrayList;

public class Receta {

	private String nombre;

	private ArrayList<String> preparacion;
	private ArrayList<Ingredientes> ingredientes;

	
	public Receta() {
		
	}


	public Receta(String nombre, ArrayList<Ingredientes> ingredientes, ArrayList<String> preparacion) {

	
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

	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	public void addIngrediente(Ingredientes ingrediente){
		ingredientes.add(ingrediente);
	}
	public void addPreparacion(String preparacion){
		this.preparacion.add(preparacion);
	}
}
