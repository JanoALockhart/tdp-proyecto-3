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
	 * Constructot de entidad
	 * @param map Es el mapa en el que se encuentra
	 */
	public Entidad(Mapa map) {
		miMapa = map;
		//miObjetoGrafico = new EntidadGrafica(img, posX, posY, width, height, priority);
		
	}
	
	public abstract void accept(Visitor v);
	
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
