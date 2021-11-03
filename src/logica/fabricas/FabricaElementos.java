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
	public Jugador construirJugador(Celda cel);
	public Blinky construirBlinky(Celda cel);
	public Pinky construirPinky(Celda cel);
	public Inky construirInky(Celda cel);
	public Clyde construirClyde(Celda cel);
	public PacDot construirPacDot(Celda cel);
	public Fruta construirFruta(Celda cel);
	public PowerPellet construirPowerPellet(Celda cel);
	public SpeedPotion construirSpeedPotion(Celda cel);
	public Bomb construirBomba(Celda cel);
	public Celda construirCelda(int x, int y);
	public Portal construirPortal(Celda cel);
	public String getLevel1Layout();
	
}
