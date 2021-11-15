package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.visitadores.Visitor;
import logica.geometria.Pixel;
import logica.mapa.Celda;

public class Persiguiendo implements StatePerseguidor {
	

	@Override
	public Pixel calcularObj() {
		// TODO Auto-generated method stub
		return null;
	}

	public void activarEfecto() {
		//Restar vida a pacman y resetearlo
		Jugador.getInstance().perderVida();
	}
}
