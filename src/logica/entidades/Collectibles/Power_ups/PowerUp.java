package logica.entidades.Collectibles.Power_ups;

import logica.entidades.Collectibles.Collectible;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.mapa.*;

public abstract class PowerUp extends Collectible {

	public PowerUp(EntidadGrafica ent, Mapa map) {
		super(ent, map);
	}

	public void activarEfecto(){		
	}
}
