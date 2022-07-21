package Inventario;

import java.util.ArrayList;
import java.util.List;

public class ProductAvailable implements ProductIterator{
    String nomProducto;
    int cantDisponible;
    private int currentPosition = 0;
    List<Product> productsCollection = new ArrayList<>();

    public ProductAvailable(String nomProducto, int cantDisponible) {
        this.nomProducto = nomProducto;
        this.cantDisponible = cantDisponible;
    }

    public void someMethod(){
    	//METODO A IMPLEMENTAR
    }
    public void setSomething(){
        System.out.println("Producto Disponible");
    }

	@Override
	public boolean hasNext() {
        someMethod();
        return currentPosition < productsCollection.size();
	}

	@Override
	public Product getNext() {
        if (!hasNext()) {
            return null;
        }
        Product productAvailable = productsCollection.get(currentPosition);
        if (productAvailable == null) {
            setSomething();
            productsCollection.set(currentPosition,null);
        }
        currentPosition++;
        return productAvailable;
	} 
}
