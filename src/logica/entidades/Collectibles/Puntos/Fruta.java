package logica.entidades.Collectibles.Puntos;

import logica.entidades.visitadores.*;
import logica.mapa.*;

public class Fruta extends Punto {
	
	public Fruta(int val, String img, Celda c, Mapa m) {
		super(img ,c.getAncho()/3 ,c.getAlto()/3,c,m);
		valor = val;
	}
	
	public void accept(Visitor v) {
		
	}
	
	public void activarEfecto() {
		
	}

	
	
}
