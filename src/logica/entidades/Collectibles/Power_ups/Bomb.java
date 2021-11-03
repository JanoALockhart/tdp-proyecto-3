package logica.entidades.Collectibles.Power_ups;


import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public class Bomb extends PowerUp {
	
	public Bomb(String img, int width,int height,Celda c) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c);
	}


	public void accept(Visitor v) {
	}

	@Override
	public void activarEfecto() {
	}

}
