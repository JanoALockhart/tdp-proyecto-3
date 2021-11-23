package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import java.awt.Point;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.visitadores.*;
import logica.geometria.Pixel;
import logica.mapa.Celda;

public abstract class StatePerseguidor {

	protected Perseguidor miFantasma;
	
	public StatePerseguidor(Perseguidor fantasma) {
		miFantasma = fantasma;
	}
	
	
	public abstract Pixel calcularObj();
	
	public abstract void activarEfecto();
	public abstract boolean puedeMorir();
}
