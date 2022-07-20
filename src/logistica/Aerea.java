package logistica;

import tienda.Tienda;

public class Aerea implements MetodoTrasporte {
	
	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Aereo
		
		System.out.println("Traportando por via Aerea");
	}

}
