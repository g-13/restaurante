package tarea1;

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
}
