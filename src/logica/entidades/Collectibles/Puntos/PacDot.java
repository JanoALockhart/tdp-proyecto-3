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
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	public void activarEfecto() {
		Partida.getInstance().addPuntaje(valor);//Se suman los puntos
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
		miMapa.subContador();//Se elimina un pacdot de la cuenta
	}

}
