package logica.entidades.Collectibles.Power_ups;


import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public class Bomb extends PowerUp {
	
	public Bomb(String img, int width,int height,Celda c) {
		super(img,width,height,c);
	}


	public void accept(Visitor v) {
	}

	@Override
	public void activarEfecto() {
	}

}
