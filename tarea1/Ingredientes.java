package tarea1;

import java.util.ArrayList;

public class Ingredientes {

	private String nombre;
	private float cantidad;
	private String unidad;
	
	public Ingredientes(String nombre, float cantidad, String unidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.unidad = unidad;
	}
	
	public Ingredientes() {
		
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String toString() {
		return "nombre: " + nombre + " cantidad: " + cantidad + unidad ;
	}
	public static void main(String[] args) {
		ArrayList<Ingredientes>mejunjes = new ArrayList<Ingredientes>();
		ArrayList<String>preparate = new ArrayList<String>();
		Ingredientes ingrediente = new Ingredientes("Tomates",3, "kg");
		System.out.println(ingrediente.toString());
		Receta receta = new Receta("yema", mejunjes, preparate);
		Ingredientes ingrediente3 = new Ingredientes("Calabacin", 2, "kg");
		Ingredientes ingrediente2 = new Ingredientes("tenaya", 2, "Gr");
		receta.addIngrediente(ingrediente3);
		receta.addPreparacion("Preparamos como nos da la gana");
		receta.addIngrediente(ingrediente2);
		receta.addPreparacion("Se cortan las peladas y go");
		System.out.println(receta.toString());
	}
}
