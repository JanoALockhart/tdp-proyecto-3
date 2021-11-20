package logica.entidades.Collectibles.Power_ups;


import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class Bomb extends PowerUp {
	
	public Bomb(EntidadGrafica ent, Mapa map) {
		super(ent, map);
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
