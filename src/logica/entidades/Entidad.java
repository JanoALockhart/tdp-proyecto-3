package logica.entidades;

public abstract class Entidad implements Element {
	
	protected ObjetoGrafico miObjetoGrafico;
	protected Celda miPosicion;
	//TODO Linkear visitor
	
	public void accept(Visitor v) {
		
	}
	
	public Celda getCelda() {
		return miPosicion;
	}
	
	public void setCelda(Celda c) {
		miPosicion = c;
	}
	
	public boolean colisionaCon(Entidad e) {
		
	}
	
	public  void eliminar() {
		//TODO
	}
}
