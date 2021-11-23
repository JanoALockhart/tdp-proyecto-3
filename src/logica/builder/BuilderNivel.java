package logica.builder;

import logica.mapa.Mapa;
import logica.partida.ControladorPerseguidores;

public interface BuilderNivel {
	
	/**
	 * 
	 */
	public void reset();
	public Mapa getNivelArmado();
	public ControladorPerseguidores getMentePerseguidores();
	public void agregarCeldaVacia(int x, int y) throws Exception;
	public void agregarPacDot(int x, int y) throws Exception;
	public void agregarJugador(int x, int y) throws Exception;
	public void agregarFruta(int x, int y) throws Exception;
	public void agregarPowerPellet(int x,int y) throws Exception;
	public void agregarSpeedPotion(int x,int y) throws Exception;
	public void agregarBomba(int x,int y) throws Exception;
	public void agregarBlinky(int x,int y) throws Exception;
	public void agregarPinky(int x, int y) throws Exception;
	public void agregarClyde(int x, int y) throws Exception;
	public void agregarInky(int x, int y) throws Exception;
	public void colocarExplosivo(int x, int y);
	
}
