package logica.entidades.Collectibles.Puntos;

import logica.entidades.Collectibles.Collectible;
import logica.mapa.Celda;

public abstract class Punto extends Collectible {
	protected int valor;
	
	public Punto(String img, int width, int height, Celda c) {
		super(img,width,height,c);
	}
	
	public void activarEfecto(){		
	}
	
}
