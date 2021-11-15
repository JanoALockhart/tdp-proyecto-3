package logica.entidades.visitadores;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.Entornos.Entorno;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;

public class VisitadorJugador implements Visitor{

	@Override
	public void serAfectadoPor(Perseguidor per) {
		//ahora se activa
		per.activarEfecto();
	}

	@Override
	public void serAfectadoPor(Collectible col) {
		col.activarEfecto();
	}

	@Override
	public void serAfectadoPor(Jugador player) {
		
	}

	@Override
	public void serAfectadoPor(Entorno ent) {
		
	}

}
