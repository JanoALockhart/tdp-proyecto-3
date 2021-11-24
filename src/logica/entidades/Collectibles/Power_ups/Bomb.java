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

	/**Es el que se encarga de activar el metodo activarEfecto();
	 * @param v recibe un visitor que luego se manda a los distintos visitadores
	 */
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
