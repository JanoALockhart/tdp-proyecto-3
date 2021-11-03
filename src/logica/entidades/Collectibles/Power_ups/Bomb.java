package logica.entidades.Collectibles.Power_ups;


import logica.entidades.visitadores.*;
import logica.mapa.*;

public class Bomb extends PowerUp {
	
	public Bomb(String img, int width,int height,Celda c, Mapa map) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c, map);
	}


	public void accept(Visitor v) {
	}

	@Override
	public void activarEfecto() {
	}

}
