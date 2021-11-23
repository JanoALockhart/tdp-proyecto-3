package logica.entidades.visitadores;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.Entornos.Entorno;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.entGrafica.JugadorGrafico;

public class VisitadorJugador implements Visitor{

	@Override
	public void serAfectadoPor(Perseguidor per) {
		per.activarEfecto();
	}

	@Override
	public void serAfectadoPor(Collectible col) {
		col.activarEfecto();
	}

	@Override
	public void serAfectadoPor(Jugador<JugadorGrafico> player) {
		//No se activa
	}

	@Override
	public void serAfectadoPor(Entorno ent) {
		//No se activa
	}

}
