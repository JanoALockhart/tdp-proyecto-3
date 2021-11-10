package logica.entidades.Collectibles.Puntos;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.visitadores.*;
import logica.mapa.*;

public class PacDot extends Punto {
	
	public PacDot(int val, String img, Celda c, Mapa m) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c,m);
		valor = val;
	}
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	public void activarEfecto() {
		Jugador.getInstance(null, null, valor, miMapa).addPuntaje(valor);
	}

}
