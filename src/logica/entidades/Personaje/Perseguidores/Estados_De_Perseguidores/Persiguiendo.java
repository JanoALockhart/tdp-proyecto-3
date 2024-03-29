package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.geometria.Pixel;

public abstract class Persiguiendo extends StatePerseguidor {
	
	public Persiguiendo(Perseguidor fantasma) {
		super(fantasma);
	}
	
	@Override
	public abstract Pixel calcularObj();

	public void activarEfecto() {
		//Restar vida a pacman y resetearlo
		Jugador.getInstance().perderVida();
	}
	
	public boolean puedeMorir() {
		return true;
	}
}
