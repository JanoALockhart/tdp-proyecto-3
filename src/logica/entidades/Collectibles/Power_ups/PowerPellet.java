package logica.entidades.Collectibles.Power_ups;

import logica.mapa.*;
import logica.entidades.visitadores.*;

public class PowerPellet extends PowerUp {
	public PowerPellet(String img, int width,int height,Celda c, Mapa map) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c, map);
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void activarEfecto() {
		// TODO Auto-generated method stub
		
	}


}
