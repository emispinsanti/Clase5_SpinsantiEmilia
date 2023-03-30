package ej_1;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	List <ItemCarrito> listacarrito = new ArrayList();
	
	public void agregar_item(ItemCarrito ic) {
		this.listacarrito.add(ic);
	}
	

	public Carrito() {
	}

	
}
