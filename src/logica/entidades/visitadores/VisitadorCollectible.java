package logica.entidades.visitadores;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.Entornos.Entorno;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;

public class VisitadorCollectible implements Visitor{

	@Override
	public void serAfectadoPor(Perseguidor per) {
		//No se activa
	}

	@Override
	public void serAfectadoPor(Collectible col) {
		//No se activa
	}

	@Override
	public void serAfectadoPor(Jugador player) {
		//No se activa
	}

	@Override
	public void serAfectadoPor(Entorno ent) {
		//No se activa
	}

}
