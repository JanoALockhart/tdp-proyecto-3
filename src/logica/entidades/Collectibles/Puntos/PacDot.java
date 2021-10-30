package logica.entidades.Collectibles.Puntos;

//import logica.entidades.Celda;
import logica.entidades.Entidad;

public class PacDot extends Punto {
	
	public PacDot(int val, String cimg, Celca c) {
			valor = val;
			
	}
	
	public void accept(Visitor v) {
		
	}
	
	public void activarEfecto() {
		
	}

	@Override
	public Celda getCelda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCelda(Celda c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean colisionaCon(Entidad e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}
}
