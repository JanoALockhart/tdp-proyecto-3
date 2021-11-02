package logica.fabricas;

import logica.entidades.Collectibles.Power_ups.*;
import logica.entidades.Collectibles.Puntos.*;
import logica.entidades.Entornos.*;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.*;
import logica.mapa.Celda;

/**
 * Interface FabricaElementos
 */
public interface FabricaElementos {
	public Jugador construirJugador();
	public Blinky construirBlinky();
	public Pinky construirPinky();
	public Inky construirInky();
	public Clyde construirClyde();
	public PacDot construirPacDot();
	public Fruta construirFruta();
	public PowerPellet construirPowerPellet();
	public SpeedPotion construirSpeedPotion();
	public Bomb construirBomba();
	public Celda construirCelda(int x, int y);
	public Portal construirPortal();
	public String getLevel1Layout();
	
}
