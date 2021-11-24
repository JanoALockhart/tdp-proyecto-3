package logica.entidades.Collectibles.Puntos;

import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class PacDot extends Punto {
	
	public PacDot(int val, EntidadGrafica ent, Mapa m) {
		super(ent, m);
		valor = val;
	}
	/**Es el que se encarga de activar el efecto de los pac-dot que es sumar puntos;
	 * @param v recibe un visitor que luego se manda a los distintos visitadores
	 */
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	/**
	 * Este metodo suma puntos cada vez que el jugador colisiona con un pac-dot
	 */
	public void activarEfecto() {
		Partida.getInstance().addPuntaje(valor);//Se suman los puntos
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
		miMapa.subContador();//Se elimina un pacdot de la cuenta
		
		Partida.getInstance().reproducirSonido("../recursos/sonidos/Pac-Dot-Sound.wav", -15.0f);
		
		
	}

}
