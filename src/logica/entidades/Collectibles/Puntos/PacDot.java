package logica.entidades.Collectibles.Puntos;

import logica.entidades.visitadores.*;
import logica.mapa.*;

public class PacDot extends Punto {
	
	public PacDot(int val, String img, Celda c) {
			super(img ,c.getAncho()/5 ,c.getAlto()/5,c);
	}
	
	public void accept(Visitor v) {
		
	}
	
	public void activarEfecto() {
		
	}

}
