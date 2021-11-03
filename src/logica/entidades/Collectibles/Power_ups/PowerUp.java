package logica.entidades.Collectibles.Power_ups;

import logica.entidades.Collectibles.Collectible;
import logica.mapa.Celda;

public abstract class PowerUp extends Collectible {

	public PowerUp(String img, int width, int height, Celda c) {
		super(img, width, height, c);
	}

	public void activarEfecto(){		
	}
	
}
