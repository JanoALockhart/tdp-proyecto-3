package logica.entidades.Collectibles;

import logica.entidades.*;
import logica.mapa.Celda;

public abstract class Collectible extends Entidad {
	public abstract void activarEfecto();
	
	public Collectible(String img, int width, int height, Celda c) {
		super(img, width, height, c);
	}
}
