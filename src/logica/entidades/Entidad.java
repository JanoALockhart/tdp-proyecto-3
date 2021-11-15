package logica.entidades;

import logica.entidades.visitadores.*;
import logica.geometria.Pixel;
import logica.mapa.*;

import java.awt.Point;
import java.awt.Rectangle;

public abstract class Entidad implements Element {
	protected EntidadGrafica miObjetoGrafico;
	protected Mapa miMapa;
	protected Visitor visi;
	protected Pixel posInicial;
	
	/**
	 * Constructor de Entidad
	 * @param img Es la imagen que tiene asociada
	 * @param width Es el ancho en pixeles de la imagen
	 * @param height Es la altura en pixeles de la imagen
	 * @param c Es la celda en la que será posicionada la entidad
	 * @param map Es el mapa en el que está la entidad
	 * @param priority Es el nivel de altura en el que será presentado en la gui
	 */
	public Entidad(String img, int width, int height, Celda c, Mapa map, int priority) {
		int posX = c.getX() * c.getAncho() + c.getAncho()/2 - width/2; //TODO ARREGLAR ESTOOO CALCULAR POSICION EN PIXELES RESPECTO A TAMA:NO CELDA
		int posY = c.getY() * c.getAlto() + c.getAlto()/2 - height/2; //TODO ARREGLAR ESTOOO
		
		posInicial = new Pixel(posX,posY);
		
		miMapa = map;
		miObjetoGrafico = new EntidadGrafica(img, posX, posY, width, height, priority);
		
	}
	
	public Entidad(String img, int width, int height, Celda c, Mapa map) {
		this(img, width, height, c, map, 1);
	}
	
	public void accept(Visitor v) {
	}
	
	/**
	 * Método que corrobora si la entidad que recibió el mensaje
	 * es intersectada por la entidad pasada por parámetro.
	 * @param e Es la entidad con la que se quiere corroborar si colisionó
	 * @return True en cado de que las entidades se intersecten. False en caso contrario
	 */
	public boolean colisionaCon(Entidad e) {
		return this.getHitbox().intersects(e.getHitbox());
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
	
	public Pixel getPos() {
		return new Pixel(miObjetoGrafico.getLbl().getX(), miObjetoGrafico.getLbl().getY());
	}

	public Visitor getVisitor() {
		return visi;
	}
	
	public void resetearPosInicial() {
		
	}
}
