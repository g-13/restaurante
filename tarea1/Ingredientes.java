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
		Ingredientes ingrediente = new Ingredientes("Tomates",3, "kg");
		System.out.println(ingrediente.toString());
	}
}
