package logica.entidades;

public abstract class Entidad implements Element {
	
	protected ObjetoGrafico miObjetoGrafico;
	protected Celda miPosicion;
	//TODO Linkear visitor
	
	public abstract Celda getCelda();
	
	public abstract void setCelda(Celda c);
	
	public abstract boolean colisionaCon(Entidad e);
	
	public abstract void eliminar();
}
