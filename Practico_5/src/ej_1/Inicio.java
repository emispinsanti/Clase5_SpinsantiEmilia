package ej_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		List <Producto> lista_prod = new ArrayList();
		
		Producto alfajor = new Producto();
		alfajor.setNombre_prod("Alfajor");
		alfajor.setCodigo_prod(1);
		alfajor.setPrecio_prod(125);
		lista_prod.add(alfajor);
		
		Producto pan = new Producto();
		pan.setNombre_prod("Pan lactal");
		pan.setCodigo_prod(2);
		pan.setPrecio_prod(240);
		lista_prod.add(pan);
		
		Producto leche = new Producto();
		leche.setNombre_prod("Leche entera");
		leche.setCodigo_prod(3);
		leche.setPrecio_prod(160);
		lista_prod.add(leche);
		
		Producto naranja = new Producto();
		naranja.setNombre_prod("Naranja");
		naranja.setCodigo_prod(4);
		naranja.setPrecio_prod(80);
		lista_prod.add(naranja);
		
		
		for (int i=0;i<lista_prod.size();i++) {
			System.out.println(lista_prod.get(i).getNombre_prod() + " - Codigo: " + lista_prod.get(i).getCodigo_prod() + " - Precio: " + lista_prod.get(i).getPrecio_prod() );
		}
		
		System.out.println("****************** \nQue producto desea agregar?"); 
		Scanner producto_in = new Scanner(System.in);
		int agregar_prod = 0;
		agregar_prod = Integer.parseInt(producto_in.nextLine());
		
		System.out.println("****************** \nCuantas unidades necesita?"); 
		Scanner cant_in = new Scanner(System.in);
		int agregar_cant = 0;
		agregar_cant = Integer.parseInt(cant_in.nextLine());
		
		ItemCarrito item1 = new ItemCarrito();
		item1.setCantidad(agregar_cant);
		item1.setCodigo_prod(agregar_prod);
		item1.setNombre_prod(lista_prod.get(agregar_prod-1).getNombre_prod());
		
		Carrito carrito1 = new Carrito();
		carrito1.agregar_item(item1);
		
		
		
		
		System.out.println("Se agrego "  + item1.getCantidad() + " unidades del producto "+ item1.getCodigo_prod() + "-" + item1.getNombre_prod()); 
		//System.out.println(carrito1.get(0));
		
	}

}
