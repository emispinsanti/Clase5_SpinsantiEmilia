package ej_1;

public class ItemCarrito extends Producto {

	Producto producto;
	int cantidad;
	
	public ItemCarrito() {
		super();
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
