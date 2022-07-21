package ChainOfResponsability;

public interface AprobadorCambio {
	
    public void setNext(AprobadorCambio ac);
    
    public boolean aprobarCambio(Articulo a);
}
