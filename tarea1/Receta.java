package tarea1;

import java.util.ArrayList;

public class Receta {

	private String nombre;

	private ArrayList<String> preparacion;
	private ArrayList<Ingredientes> ingredientes;
	private int persona = 4;
	private String autor;
	
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
	
	public String listarIngredientes(){
		String acumulador = "";
		for (int i = 0; i < ingredientes.size(); i++) {
			acumulador = acumulador +"\t"+" "+ ingredientes.get(i).toString()+"\n";  
		}
		return acumulador;
	}
	
	public String listarPreparacion(){
		String acumulador = "";
		for (int i = 0; i < preparacion.size(); i++) {
			acumulador = acumulador +"\t" +"PASO " + i + ": " + preparacion.get(i)+"\n";
		}
		return acumulador;
	}
	
	public String toString(){
		return nombre.toUpperCase()+ "\n"+ "Ingredientes:\n"+ listarIngredientes()+"\n"+"Preparacion:\n"+listarPreparacion();
	}


	public Receta recetaPara (int numPersonas){
		
		float ingrediente = 0;
		Receta r = new Receta(nombre, ingredientes, preparacion);
		for (int i = 0; i < ingredientes.size(); i++) {
			 ingrediente = ingredientes.get(i).getCantidad()/persona;
			 r.ingredientes.get(i).setCantidad(ingrediente*numPersonas);
		}
	
		return r;
	}
	
	
}
