package logica.builder;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.mapa.Mapa;
import logica.partida.ControladorPerseguidores;

public interface BuilderNivel {
	
	/**
	 * 
	 */
	public void reset();
	public Mapa getNivelArmado();
	public Iterable<Perseguidor> getPerseguidores();//TODO remover este
	public ControladorPerseguidores getMentePerseguidores();
	public void agregarCeldaVacia(int x, int y) throws Exception;
	public void agregarPacDot(int x, int y) throws Exception;
	public void agregarJugador(int x, int y) throws Exception;
	public void agregarFruta(int x, int y) throws Exception;
	public void agregarPowerPellet(int x,int y) throws Exception;
	public void agregarSpeedPotion(int x,int y) throws Exception;
	public void agregarBomba(int x,int y) throws Exception;
	public void agregarBlinky(int x,int y) throws Exception;
	
}
