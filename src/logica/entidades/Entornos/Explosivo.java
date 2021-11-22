package logica.entidades.Entornos;

import logica.entidades.Entidad;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;
import logica.mapa.Mapa;
import logica.partida.Partida;

public class Explosivo extends Entorno {

	private int radio;
	private int delayExplosion;
	protected TimerExplosion miTimer;
	protected EntidadGrafica fuego;
	
	public Explosivo(EntidadGrafica tnt, EntidadGrafica fuego, Mapa map) {
		super(tnt,map);
		map.colocarEnCeldasQueToca(this);
		Partida.getInstance().colocarEntidadGrafica(tnt);
		miTimer = new TimerExplosion(this);
		this.fuego = fuego;
	}
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	public void iniciar() {
		miTimer.run();
	}
	
	/**
	 * Pre condiciones
	 * Al explotar, hay una tnt logica en el mapa, otra tnt grafica en la gui
	 * ->Eliminar la TNT Logica del mapa, y la TNT grafica de la gui
	 * ->Cambiar la entidad grafica de TNT a FUEGO
	 * ->Agregarlo al mapa y a la gui
	 * 
	 */
	public void explotar() {
		Partida.getInstance().elimnarEntidadGrafica(miObjetoGrafico);
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());
		miObjetoGrafico = fuego;
		Partida.getInstance().colocarEntidadGrafica(miObjetoGrafico);
		miMapa.colocarEnCeldasQueToca(this);
	}
	
	/**
	 * Eliminar entidad de mapa y de la gui
	 */
	public void apagar() {
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());
		Partida.getInstance().elimnarEntidadGrafica(miObjetoGrafico);
	}


}
