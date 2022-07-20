package logistica;

import tienda.Tienda;

public class Ferrea implements MetodoTrasporte {
	
	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Ferrea

		System.out.println("Traportando por via Ferrea");
	}
}
