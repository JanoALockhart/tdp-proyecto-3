package logica.entidades.Collectibles.Puntos;

import logica.entidades.Collectibles.Collectible;
import logica.mapa.Celda;
import logica.mapa.Mapa;

public abstract class Punto extends Collectible {
	protected int valor;
	
	public Punto(String img, int width, int height, Celda c, Mapa m) {
		super(img,width,height,c,m);
	}
	
	public void activarEfecto(){		
	}
	
}
