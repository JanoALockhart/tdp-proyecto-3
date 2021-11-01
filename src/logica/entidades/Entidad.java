package logica.entidades;

import logica.entidades.visitadores.*;
import logica.mapa.*;

abstract class Entidad implements Element {
	
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
		//TODO 
		return true;
	}
	
	public  void eliminar() {
		//TODO
	}
}
