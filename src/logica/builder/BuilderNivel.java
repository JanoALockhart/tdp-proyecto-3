package logica.builder;

import logica.mapa.Mapa;

public interface BuilderNivel {

	public void reset();
	public Mapa getNivelArmado();
	public void agregarPacDot(int x, int y) throws Exception;
	public void agregarJugador(int x, int y) throws Exception;
	public void agregarFruta(int x, int y) throws Exception;
	public void agregarPowerPellet(int x,int y) throws Exception;
	public void agregarSpeedPotion(int x,int y) throws Exception;
	public void agregarBomba(int x,int y) throws Exception;
	
}
