package logica.entidades.Collectibles.Power_ups;

import logica.mapa.*;
import logica.partida.Partida;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;

public class PowerPellet extends PowerUp {
	public PowerPellet(EntidadGrafica ent, Mapa map) {
		super(ent, map);
	}

	/**Es el que se encarga de activar el efecto de los power Pellet que es para poder comer a los fantasmas(osea matar);
	 * @param v recibe un visitor que luego se manda a los distintos visitadores
	 */
	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	/**
	 * Este metodo te deja matar a los fantasmas, y hace que estos huyan del jugador 
	 */
	@Override
	public void activarEfecto() {
		Partida.getInstance().asustarPerseguidores();//TODO implementar asustar
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
	}


}
