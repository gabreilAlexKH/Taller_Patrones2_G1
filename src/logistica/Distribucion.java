package logistica;

import tienda.Tienda;

public class Distribucion {
	
	private MetodoTrasporte metodo;

	public void setMetodo(MetodoTrasporte metodo) {
		this.metodo = metodo;
	}
	
	public void transportar( Tienda Origen,  Tienda Destino) {
		
		metodo.transportar(Origen, Destino);
	}
	

}
