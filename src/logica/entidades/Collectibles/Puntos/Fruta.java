package logica.entidades.Collectibles.Puntos;

import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class Fruta extends Punto {
	
	public Fruta(int val, String img, Celda c, Mapa m) {
		super(img ,c.getAncho()/1 ,c.getAlto()/1,c,m);
		valor = val;
	}
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	public void activarEfecto() {
		Partida.getInstance().addPuntaje(valor);
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
	}

	
	
}
