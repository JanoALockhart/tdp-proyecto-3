package logica.entidades.Collectibles.Power_ups;

import logica.entidades.Collectibles.Collectible;
import logica.mapa.*;

public abstract class PowerUp extends Collectible {

	public PowerUp(String img, int width, int height, Celda c, Mapa map) {
		super(img, width, height, c, map);
	}

	public void activarEfecto(){		
	}
}
