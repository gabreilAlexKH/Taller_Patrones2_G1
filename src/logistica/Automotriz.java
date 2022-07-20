package logistica;

import tienda.Tienda;

public class Automotriz implements MetodoTrasporte {
	
	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Automotriz
		
		System.out.println("Traportando por via Automotriz");
	}

}
