package logica.entidades.visitadores;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.Entornos.Entorno;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.partida.Partida;
import main.Main;

public class VisitadorEntorno implements Visitor{

	@Override
	public void serAfectadoPor(Perseguidor per) {
		Partida.getInstance().addPuntaje(Integer.parseInt(Main.personajesConfig.getProperty("puntajeAlMorir")));
		per.morir();
		//TODO Chequear esto si no es con el state.activarEfecto desde fantasma
	}

	@Override
	public void serAfectadoPor(Collectible col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serAfectadoPor(Jugador player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serAfectadoPor(Entorno ent) {
		// TODO Auto-generated method stub
		
	}

}
