package logica.entidades.Collectibles.Power_ups;

import logica.entidades.visitadores.*;
import logica.mapa.*;

public class SpeedPotion extends PowerUp {
	protected int duracion;
	
	public SpeedPotion(String img, int width,int height,Celda c, Mapa map) {
		super(img ,c.getAncho(),c.getAlto(),c, map);
	}

	@Override
	public void accept(Visitor v) {
	}

	@Override
	public void activarEfecto() {
	}


}
