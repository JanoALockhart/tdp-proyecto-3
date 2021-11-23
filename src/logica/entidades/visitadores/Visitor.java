package logica.entidades.visitadores;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.Entornos.Entorno;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.entGrafica.JugadorGrafico;



/**
 * Interfaz visitor. PATRON VISITOR
 *
 */
public interface Visitor {

	public void serAfectadoPor(Perseguidor per);
	public void serAfectadoPor(Collectible col);
	public void serAfectadoPor(Jugador<JugadorGrafico> player);
	public void serAfectadoPor(Entorno ent);
}
