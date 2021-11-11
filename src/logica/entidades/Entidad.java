package logica.entidades;

import logica.entidades.visitadores.*;
import logica.mapa.*;
import java.awt.Rectangle;

public abstract class Entidad implements Element {
	protected EntidadGrafica miObjetoGrafico;
	protected Mapa miMapa;
	protected Visitor visi;
	
	
	public Entidad(String img, int width, int height, Celda c, Mapa map, int priority) {
		int PosX = c.getX() * c.getAncho() + c.getAncho()/2 - width/2; //TODO ARREGLAR ESTOOO CALCULAR POSICION EN PIXELES RESPECTO A TAMA:NO CELDA
		int PosY = c.getY() * c.getAlto() + c.getAlto()/2 - height/2; //TODO ARREGLAR ESTOOO
		
		miMapa = map;
		miObjetoGrafico = new EntidadGrafica(img, PosX, PosY, width, height, priority);
		
	}
	
	public Entidad(String img, int width, int height, Celda c, Mapa map) {
		this(img, width, height, c, map, 1);
	}
	
	public void accept(Visitor v) {
		
	}
	
	public boolean colisionaCon(Entidad e) {
		//TODO return true;
	}
	
	public EntidadGrafica getEntidadGrafica() {
		return miObjetoGrafico;
	}
	
	public Rectangle getHitbox() {
		return miObjetoGrafico.getRect();
	}
	
	//METODOS MOVIMIENTO //TODO MOVER A PERSONAJE (CORTAR)
	public void moverNorte() {
		miObjetoGrafico.moverNorte();
	}

	public void moverSur() {
		miObjetoGrafico.moverSur();
	}
	
	public void moverEste() {
		miObjetoGrafico.moverEste();
	}
	
	public void moverOeste() {
		miObjetoGrafico.moverOeste();
	}
	
	public int getX() {
		return miObjetoGrafico.getLbl().getX()/miMapa.getAnchoCelda();
	}

	public int getY() {
		return miObjetoGrafico.getLbl().getY()/miMapa.getAltoCelda();
	}

	public Visitor getVisitor() {
		return visi;
	}
}
