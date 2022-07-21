import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Inventario.*;
import logistica.*;
import tienda.Coordenadas;
import tienda.Tienda;

public class Cliente {
	
	public static void main(String[] args ) {
		
		//Secuencia Patron Iterator
		FaultyProducts f1= new FaultyProducts("iPhone 11","Bateria degradada");
		FaultyProducts f2= new FaultyProducts("Epson L355","Sistema de impresion dañado");
		FaultyProducts f3= new FaultyProducts("LG LT56","Puerto HDMI comprometido");
		List<FaultyProducts> fp= new ArrayList<FaultyProducts>();
		fp.add(f1);
		fp.add(f2);
		fp.add(f3);
		
		Iterator<FaultyProducts> it=fp.iterator();
		while(it.hasNext()) {
			System.out.println("Producto con falla: "+it.next());
		}
		
		//Secuencia Patron Strategy
		
		Tienda tienda_A = new Tienda(new Coordenadas(1.05 , -79.2));
		Tienda tienda_B = new Tienda(new Coordenadas(-2.18333 , -79.8833 ));
		Tienda tienda_C = new Tienda(new Coordenadas(-2.16667 , -79.8333));
		
		Distribucion distribucion = new Distribucion();
		
		//Trasportar por via Ferrea de tienda_A a tienda_B (primer trayecto)
		MetodoTrasporte metodo = new Ferrea();
		distribucion.setMetodo(metodo);
		distribucion.transportar(tienda_A, tienda_B);
		
		//Trasportar por via Ferrea de tienda_B a tienda_C (segundo trayecto)
		metodo = new Automotriz();
		distribucion.setMetodo(metodo);
		distribucion.transportar(tienda_B, tienda_C);
		
		
		//Secuencia Patron Chain of responsability
	}

}
