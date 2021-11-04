package logica.entidades.Collectibles;

import logica.entidades.*;
import logica.mapa.Celda;
import logica.mapa.Mapa;

public abstract class Collectible extends Entidad {
	public abstract void activarEfecto();
	
	public Collectible(String img, int width, int height, Celda c, Mapa m) {
		super(img, width, height, c, m);
	}
}
