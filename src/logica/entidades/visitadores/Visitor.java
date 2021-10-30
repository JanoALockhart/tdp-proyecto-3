package logica.entidades.visitadores;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.Entornos.Entorno;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;


/**
 * Interfaz visitor. PATRON VISITOR
 *
 */
public interface Visitor {

	public void serAfectadoPor(Perseguidor per);
	public void serAfectadoPor(Collectible col);
	public void serAfectadoPor(Jugador player);
	public void serAfectadoPor(Entorno ent);
}
