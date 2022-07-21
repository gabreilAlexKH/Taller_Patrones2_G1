package ChainOfResponsability;

public abstract class Trabajador implements AprobadorCambio{
    private AprobadorCambio next;
    
    public AprobadorCambio getNext() {
    	return this.next;
    };
    
    @Override
    public void setNext(AprobadorCambio ac){
        next = ac;
       }
    
    public boolean aprobarCambio(Articulo a){
        if(next != null) return next.aprobarCambio(a);
        return true;
        }

}
