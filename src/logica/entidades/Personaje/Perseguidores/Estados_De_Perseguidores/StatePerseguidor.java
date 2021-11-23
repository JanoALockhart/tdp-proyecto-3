package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;


import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.geometria.Pixel;

public abstract class StatePerseguidor {

	protected Perseguidor miFantasma;
	
	public StatePerseguidor(Perseguidor fantasma) {
		miFantasma = fantasma;
	}
	
	
	public abstract Pixel calcularObj();
	
	public abstract void activarEfecto();
	
	public abstract boolean puedeMorir();

}
