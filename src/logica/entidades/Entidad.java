package logica.entidades;

import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.entGrafica.PersonajeGrafico;
import logica.entidades.entGrafica.estados.Normal;
import logica.entidades.visitadores.*;
import logica.geometria.HitBox;
import logica.geometria.Pixel;
import logica.mapa.*;

import java.awt.Point;
import java.awt.Rectangle;

public abstract class Entidad<EG extends EntidadGrafica> implements Element {
	protected EG miObjetoGrafico;
	protected Mapa miMapa;
	protected Visitor visi;
	
	/**
	 * Constructor de Entidad
	 * @param img Es la imagen que tiene asociada
	 * @param width Es el ancho en pixeles de la imagen
	 * @param height Es la altura en pixeles de la imagen
	 * @param c Es la celda en la que será posicionada la entidad
	 * @param map Es el mapa en el que está la entidad
	 * @param priority Es el nivel de altura en el que será presentado en la gui
	 */
	public Entidad(Mapa map) {
		miMapa = map;
		//miObjetoGrafico = new EntidadGrafica(img, posX, posY, width, height, priority);
		
	}
	
	public void accept(Visitor v) {
	}
	
	/**
	 * Método que corrobora si la entidad que recibió el mensaje
	 * es intersectada por la entidad pasada por parámetro.
	 * @param entity Es la entidad con la que se quiere corroborar si colisionó
	 * @return True en cado de que las entidades se intersecten. False en caso contrario
	 */
	public boolean colisionaCon(Entidad<? extends EntidadGrafica> entity) {
		return this.getHitbox().intersects(entity.getHitbox());
	}
	
	public EntidadGrafica getEntidadGrafica() {
		return miObjetoGrafico;
	}
	
	public HitBox getHitbox() {
		return miObjetoGrafico.getRect();
	}
	
	public Pixel getPos() {
		return miObjetoGrafico.getPos();
	}

	public Visitor getVisitor() {
		return visi;
	}
	
	public Pixel getPosInicial() {return miObjetoGrafico.getPosInicial();}
}
