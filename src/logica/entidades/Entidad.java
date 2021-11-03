package logica.entidades;

import logica.entidades.visitadores.*;
import logica.mapa.*;

public abstract class Entidad implements Element {
	protected EntidadGrafica miObjetoGrafico;
	//TODO Linkear visitor
	
	
	public Entidad(String img, int width, int height, Celda c) {
		int PosX = c.getX() * c.getAncho() + c.getAncho()/2 - width/2; //TODO ARREGLAR ESTOOO CALCULAR POSICION EN PIXELES RESPECTO A TAMA:NO CELDA
		int PosY = c.getY() * c.getAlto() + c.getAlto()/2 - height/2; //TODO ARREGLAR ESTOOO
		
		miObjetoGrafico = new EntidadGrafica(img, PosX, PosY, width, height);
		
	}
	
	public void accept(Visitor v) {
		
	}
	
	public boolean colisionaCon(Entidad e) {
		//TODO 
		return true;
	}
	
	public EntidadGrafica getEntidadGrafica() {
		return miObjetoGrafico;
	}
}
