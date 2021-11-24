package logica.entidades.Collectibles.Puntos;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.mapa.Mapa;

public abstract class Punto extends Collectible {
	protected int valor;
	
	public Punto(EntidadGrafica ent, Mapa m) {
		super(ent,m);
	}
	
	/**
	 * Este activa el efecto de cada colleccionable
	 */
	public abstract void activarEfecto();
	
}
