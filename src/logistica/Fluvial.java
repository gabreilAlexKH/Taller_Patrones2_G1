package logistica;

import tienda.Tienda;

public class Fluvial implements MetodoTrasporte {

	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Fluvial

		System.out.println("Traportando por via Fluvial");
	}
	
	

}
