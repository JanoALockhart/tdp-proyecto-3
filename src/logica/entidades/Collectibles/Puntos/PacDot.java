package logica.entidades.Collectibles.Puntos;

import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class PacDot extends Punto {
	
	public PacDot(int val, String img, Celda c, Mapa m) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c,m);
		valor = val;
	}
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	public void activarEfecto() {
		Partida.getInstance().addPuntaje(valor);//Se suman los puntos
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
	}

}
