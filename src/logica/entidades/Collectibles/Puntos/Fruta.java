package logica.entidades.Collectibles.Puntos;

//import logica.entidades.Celda;
import logica.entidades.Entidad;
//import logica.entidades.Visitor;

public class Fruta extends Punto {
	
	public Fruta(int val, String img, Celda c) {
		valor = val;
		//TODO
	}

	@Override
	public void activarEfecto() {
		// TODO Auto-generated method stub
		
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
	public void accept(Visitor v) {
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
