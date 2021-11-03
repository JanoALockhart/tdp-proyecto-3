package logica.entidades.Collectibles.Power_ups;

import logica.mapa.*;
import logica.entidades.Entidad;
import logica.entidades.visitadores.*;

public class PowerPellet extends Power_up {
	public PowerPellet(String img, int width,int height,Celda c) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c);
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
