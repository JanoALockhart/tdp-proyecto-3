package logica.entidades.Collectibles.Power_ups;

import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public class SpeedPotion extends PowerUp {
	protected int duracion;
	
	public SpeedPotion(String img, int width,int height,Celda c) {
		super(img,width,height,c);
	}

	@Override
	public void accept(Visitor v) {
	}

	@Override
	public void activarEfecto() {
	}


}
