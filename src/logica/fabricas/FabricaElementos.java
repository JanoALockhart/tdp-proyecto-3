package logica.fabricas;

import logica.entidades.Collectibles.Power_ups.*;
import logica.entidades.Collectibles.Puntos.*;
import logica.entidades.Entornos.*;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.*;
import logica.mapa.Celda;
import logica.mapa.Mapa;

/**
 * Interface FabricaElementos
 */
public interface FabricaElementos {
	public Jugador construirJugador(Celda cel, Mapa map);
	public Blinky construirBlinky(Celda cel, Mapa map);
	public Pinky construirPinky(Celda cel, Mapa map);
	public Inky construirInky(Celda cel, Mapa map);
	public Clyde construirClyde(Celda cel, Mapa map);
	public PacDot construirPacDot(Celda cel, Mapa map);
	public Fruta construirFruta(Celda cel, Mapa map);
	public PowerPellet construirPowerPellet(Celda cel, Mapa map);
	public SpeedPotion construirSpeedPotion(Celda cel, Mapa map);
	public Bomb construirBomba(Celda cel, Mapa map);
	public Celda construirCelda(int x, int y);
	public Portal construirPortal(Celda cel, Mapa maps);
	public String getLevel1Layout();
	public String getLevel2Layout();
	public String getLevel3Layout();
	
}
