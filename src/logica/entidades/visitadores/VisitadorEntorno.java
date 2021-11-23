package logica.entidades.visitadores;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.Entornos.Entorno;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.entGrafica.JugadorGrafico;

public class VisitadorEntorno implements Visitor{
	//Atributo de Explosivo
	@Override
	public void serAfectadoPor(Perseguidor per) {
		//Expolosivo.exploto
		per.morir();
	}

	@Override
	public void serAfectadoPor(Collectible col) {
		//No se activa
	}

	@Override
	public void serAfectadoPor(Jugador<? extends JugadorGrafico> player) {
		//No se activa
	}

	@Override
	public void serAfectadoPor(Entorno ent) {
		//No se activa
	}

}
