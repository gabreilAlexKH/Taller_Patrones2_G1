package logistica;

import tienda.Tienda;

public class Ciclista implements MetodoTrasporte {
	
	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Ciclista
		
		System.out.println("Traportando por via Ciclista");
	}

}
