package logica.entidades.Collectibles.Power_ups;

import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public class SpeedPotion extends PowerUp {
	protected int duracion;
	
	public SpeedPotion(String img, int width,int height,Celda c) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c);
	}

	@Override
	public void accept(Visitor v) {
	}

	@Override
	public void activarEfecto() {
	}


}
