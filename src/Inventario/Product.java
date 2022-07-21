package Inventario;

public class Product implements TechnologyItems{
	
	String nomProducto;
    String ubicacionProd;

	@Override
	public ProductIterator createProductIterator() {
		System.out.println("...");
        return null;
	}

}
