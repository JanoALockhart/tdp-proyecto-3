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
	
	public Explosivo(EntidadGrafica tnt, EntidadGrafica fuego, Mapa map) {
		super(tnt,map);
		map.colocarEnCeldasQueToca(this);
		//TODO IMPRIMIR EN PARTIDA Partida.getInstance().
		miTimer = new TimerExplosion(this);
		//TODO DECIRLE A PARTIDA QUE IMPRIMA AL EXPLOSIVO
	}
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
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
		//Cambiar entidad grafica
		
		//Eliminar la tnt logica del mapa
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());
		
	}
	
	/**
	 * Eliminar entidad de mapa y de la gui
	 */
	public void apagar() {
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());
		Partida.getInstance().elimnarEntidadGrafica(miObjetoGrafico);
	}

	@Override
	public void activarEfecto() {
		//LLamar a morir desde el visitor
	}
	
}
