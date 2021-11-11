package logica.entidades.Collectibles.Power_ups;

import logica.mapa.*;
import logica.entidades.visitadores.*;

public class PowerPellet extends PowerUp {
	public PowerPellet(String img, int width,int height,Celda c, Mapa map) {
		super(img ,c.getAncho() ,c.getAlto(),c, map);
	}

	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	@Override
	public void activarEfecto() {
		miMapa.asustarPerseguidores();
	}


}
