package logica.entidades.Collectibles.Power_ups;

import logica.mapa.*;
import logica.partida.Partida;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;

public class PowerPellet extends PowerUp {
	public PowerPellet(EntidadGrafica ent, Mapa map) {
		super(ent, map);
	}

	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	@Override
	public void activarEfecto() {
		Partida.getInstance().asustarPerseguidores();//TODO implementar asustar
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
	}


}
