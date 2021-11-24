package logica.entidades.Collectibles.Puntos;

import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class Fruta extends Punto {
	
	public Fruta(int val, EntidadGrafica ent, Mapa m) {
		super(ent ,m);
		valor = val;
	}
	
	/**Es el que se encarga de activar el efecto de las frutas que es sumar puntos;
	 * @param v recibe un visitor que luego se manda a los distintos visitadores
	 */
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	/**
	 * Este metodo suma puntos cada vez que el jugador colisiona con una fruta
	 */
	public void activarEfecto() {
		Partida.getInstance().addPuntaje(valor);
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
		
		Partida.getInstance().reproducirSonido("../recursos/sonidos/Fruta-Sound.wav", -10.0f);
	}

	
	
}
