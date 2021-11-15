package logica.entidades.Collectibles.Power_ups;


import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class Bomb extends PowerUp {
	
	public Bomb(String img, int width,int height,Celda c, Mapa map) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c, map);
	}


	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	@Override
	public void activarEfecto() {
		Jugador.getInstance().agregarBomba();//TODO IMPLEMENTAR
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
	}

}
