package logica.builder;

import logica.entidades.Entidad;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.fabricas.FabricaElementos;
import logica.mapa.*;

public class ArquitectoNivel implements BuilderNivel{
	private FabricaElementos miFabrica;
	private Mapa nivel;
	
	
	public ArquitectoNivel(FabricaElementos fabrica) {
		nivel = new Mapa();
		miFabrica = fabrica;
	}


	/**
	 * Metodo que posiciona celdas y entidades para el nivel1
	 */
	public void armarNivel1() {
		try {
			//Agregar Jugador
			agregarJugador(10,18);
			
			//Agregar pac dots
			agregarPacDot(1,1);
			agregarPacDot(2,1);
			agregarPacDot(3,1);
			agregarPacDot(4,1);
			agregarPacDot(5,1);
			agregarPacDot(6,1);
			agregarPacDot(7,1);
			agregarPacDot(8,1);
			agregarPacDot(9,1);
			agregarPacDot(11,1);
			agregarPacDot(12,1);
			agregarPacDot(13,1);
			agregarPacDot(14,1);
			agregarPacDot(15,1);
			agregarPacDot(16,1);
			agregarPacDot(17,1);
			agregarPacDot(18,1);
			agregarPacDot(19,1);
			agregarPacDot(1,2);
			agregarPacDot(4,2);
			agregarPacDot(9,2);
			agregarPacDot(11,2);
			agregarPacDot(16,2);
			agregarPacDot(19,2);
			agregarPacDot(1,3);
			agregarPacDot(4,3);
			agregarPacDot(9,3);
			agregarPacDot(11,3);
			agregarPacDot(16,3);
			agregarPacDot(19,3);
			agregarPacDot(1,4);
			agregarPacDot(2,4);
			agregarPacDot(3,4);
			agregarPacDot(4,4);
			agregarPacDot(5,4);
			agregarPacDot(6,4);
			agregarPacDot(7,4);
			agregarPacDot(8,4);
			agregarPacDot(9,4);
			agregarPacDot(10,4);
			agregarPacDot(11,4);
			agregarPacDot(12,4);
			agregarPacDot(13,4);
			agregarPacDot(14,4);
			agregarPacDot(15,4);
			agregarPacDot(16,4);
			agregarPacDot(17,4);
			agregarPacDot(18,4);
			agregarPacDot(19,4);
			agregarPacDot(1,5);
			agregarPacDot(4,5);
			agregarPacDot(6,5);
			agregarPacDot(14,5);
			agregarPacDot(16,5);
			agregarPacDot(19,5);
			agregarPacDot(1,6);
			agregarPacDot(2,6);
			agregarPacDot(3,6);
			agregarPacDot(4,6);
			agregarPacDot(6,6);
			agregarPacDot(7,6);
			agregarPacDot(8,6);
			agregarPacDot(9,6);
			agregarPacDot(11,6);
			agregarPacDot(12,6);
			agregarPacDot(13,6);
			agregarPacDot(14,6);
			agregarPacDot(16,6);
			agregarPacDot(17,6);
			agregarPacDot(18,6);
			agregarPacDot(19,6);
			agregarPacDot(4,7);
			agregarPacDot(9,7);
			agregarPacDot(11,7);
			agregarPacDot(16,7);
			agregarPacDot(4,8);
			agregarPacDot(6,8);
			agregarPacDot(7,8);
			agregarPacDot(8,8);
			agregarPacDot(9,8);
			agregarPacDot(10,8);
			agregarPacDot(11,8);
			agregarPacDot(12,8);
			agregarPacDot(13,8);
			agregarPacDot(14,8);
			agregarPacDot(16,8);
			agregarPacDot(4,9);
			agregarPacDot(6,9);
			agregarPacDot(10,9);
			agregarPacDot(14,9);
			agregarPacDot(16,9);
			agregarPacDot(4,10);
			agregarPacDot(6,10);
			agregarPacDot(8,10);
			agregarPacDot(9,10);
			agregarPacDot(10,10);
			agregarPacDot(11,10);
			agregarPacDot(12,10);
			agregarPacDot(14,10);
			agregarPacDot(16,10);
			agregarPacDot(1,11);
			agregarPacDot(2,11);
			agregarPacDot(3,11);
			agregarPacDot(4,11);
			agregarPacDot(5,11);
			agregarPacDot(6,11);
			agregarPacDot(8,11);
			agregarPacDot(9,11);
			agregarPacDot(10,11);
			agregarPacDot(11,11);
			agregarPacDot(12,11);
			agregarPacDot(14,11);
			agregarPacDot(15,11);
			agregarPacDot(16,11);
			agregarPacDot(17,11);
			agregarPacDot(18,11);
			agregarPacDot(19,11);
			agregarPacDot(4,12);
			agregarPacDot(6,12);
			agregarPacDot(8,12);
			agregarPacDot(9,12);
			agregarPacDot(10,12);
			agregarPacDot(11,12);
			agregarPacDot(12,12);
			agregarPacDot(14,12);
			agregarPacDot(16,12);
			agregarPacDot(4,13);
			agregarPacDot(6,13);
			agregarPacDot(14,13);
			agregarPacDot(16,13);
			agregarPacDot(4,14);
			agregarPacDot(6,14);
			agregarPacDot(7,14);
			agregarPacDot(8,14);
			agregarPacDot(9,14);
			agregarPacDot(10,14);
			agregarPacDot(11,14);
			agregarPacDot(12,14);
			agregarPacDot(13,14);
			agregarPacDot(14,14);
			agregarPacDot(16,14);
			agregarPacDot(4,15);
			agregarPacDot(6,15);
			agregarPacDot(14,15);
			agregarPacDot(16,15);
			agregarPacDot(1,16);
			agregarPacDot(2,16);
			agregarPacDot(3,16);
			agregarPacDot(4,16);
			agregarPacDot(5,16);
			agregarPacDot(6,16);
			agregarPacDot(7,16);
			agregarPacDot(8,16);
			agregarPacDot(9,16);
			agregarPacDot(11,16);
			agregarPacDot(12,16);
			agregarPacDot(13,16);
			agregarPacDot(14,16);
			agregarPacDot(15,16);
			agregarPacDot(16,16);
			agregarPacDot(17,16);
			agregarPacDot(18,16);
			agregarPacDot(19,16);
			agregarPacDot(1,17);
			agregarPacDot(5,17);
			agregarPacDot(9,17);
			agregarPacDot(11,17);
			agregarPacDot(15,17);
			agregarPacDot(19,17);
			agregarPacDot(1,18);
			agregarPacDot(2,18);
			agregarPacDot(3,18);
			agregarPacDot(5,18);
			agregarPacDot(6,18);
			agregarPacDot(7,18);
			agregarPacDot(8,18);
			agregarPacDot(9,18);
			agregarPacDot(11,18);
			agregarPacDot(12,18);
			agregarPacDot(13,18);
			agregarPacDot(14,18);
			agregarPacDot(15,18);
			agregarPacDot(17,18);
			agregarPacDot(18,18);
			agregarPacDot(19,18);
			agregarPacDot(3,19);
			agregarPacDot(5,19);
			agregarPacDot(7,19);
			agregarPacDot(13,19);
			agregarPacDot(15,19);
			agregarPacDot(17,19);
			agregarPacDot(1,20);
			agregarPacDot(2,20);
			agregarPacDot(3,20);
			agregarPacDot(4,20);
			agregarPacDot(5,20);
			agregarPacDot(7,20);
			agregarPacDot(8,20);
			agregarPacDot(9,20);
			agregarPacDot(11,20);
			agregarPacDot(12,20);
			agregarPacDot(13,20);
			agregarPacDot(15,20);
			agregarPacDot(16,20);
			agregarPacDot(17,20);
			agregarPacDot(18,20);
			agregarPacDot(19,20);
			agregarPacDot(1,21);
			agregarPacDot(9,21);
			agregarPacDot(11,21);
			agregarPacDot(19,21);
			agregarPacDot(1,22);
			agregarPacDot(2,22);
			agregarPacDot(3,22);
			agregarPacDot(4,22);
			agregarPacDot(5,22);
			agregarPacDot(6,22);
			agregarPacDot(7,22);
			agregarPacDot(8,22);
			agregarPacDot(9,22);
			agregarPacDot(10,22);
			agregarPacDot(11,22);
			agregarPacDot(12,22);
			agregarPacDot(13,22);
			agregarPacDot(14,22);
			agregarPacDot(15,22);
			agregarPacDot(16,22);
			agregarPacDot(17,22);
			agregarPacDot(18,22);
			agregarPacDot(19,22);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	/**
	 * Metodo que posiciona celdas y entidades para el nivel2
	 */
	public void armarNivel2() {
		try {
			agregarPacDot(1,1);
			agregarPacDot(2,1);
			agregarPacDot(3,1);
			agregarPacDot(4,1);
			agregarPacDot(5,1);
			agregarPacDot(6,1);
			agregarPacDot(7,1);
			agregarPacDot(8,1);
			agregarPacDot(9,1);
			agregarPacDot(11,1);
			agregarPacDot(12,1);
			agregarPacDot(13,1);
			agregarPacDot(14,1);
			agregarPacDot(15,1);
			agregarPacDot(17,1);
			agregarPacDot(18,1);
			agregarPacDot(19,1);
			agregarPacDot(1,2);
			agregarPacDot(7,2);
			agregarPacDot(9,2);
			agregarPacDot(11,2);
			agregarPacDot(15,2);
			agregarPacDot(17,2);
			agregarPacDot(18,2);
			agregarPacDot(19,2);
			agregarPacDot(1,3);
			agregarPacDot(3,3);
			agregarPacDot(4,3);
			agregarPacDot(5,3);
			agregarPacDot(7,3);
			agregarPacDot(9,3);
			agregarPacDot(11,3);
			agregarPacDot(15,3);
			agregarPacDot(16,3);
			agregarPacDot(17,3);
			agregarPacDot(18,3);
			agregarPacDot(19,3);
			agregarPacDot(1,4);
			agregarPacDot(3,4);
			agregarPacDot(5,4);
			agregarPacDot(7,4);
			agregarPacDot(9,4);
			agregarPacDot(11,4);
			agregarPacDot(15,4);
			agregarPacDot(17,4);
			agregarPacDot(18,4);
			agregarPacDot(19,4);
			agregarPacDot(1,5);
			agregarPacDot(3,5);
			agregarPacDot(5,5);
			agregarPacDot(7,5);
			agregarPacDot(9,5);
			agregarPacDot(11,5);
			agregarPacDot(12,5);
			agregarPacDot(13,5);
			agregarPacDot(14,5);
			agregarPacDot(15,5);
			agregarPacDot(17,5);
			agregarPacDot(18,5);
			agregarPacDot(19,5);
			agregarPacDot(1,6);
			agregarPacDot(3,6);
			agregarPacDot(5,6);
			agregarPacDot(7,6);
			agregarPacDot(9,6);
			agregarPacDot(11,6);
			agregarPacDot(13,6);
			agregarPacDot(15,6);
			agregarPacDot(1,7);
			agregarPacDot(3,7);
			agregarPacDot(5,7);
			agregarPacDot(6,7);
			agregarPacDot(7,7);
			agregarPacDot(9,7);
			agregarPacDot(11,7);
			agregarPacDot(13,7);
			agregarPacDot(14,7);
			agregarPacDot(15,7);
			agregarPacDot(16,7);
			agregarPacDot(17,7);
			agregarPacDot(18,7);
			agregarPacDot(19,7);
			agregarPacDot(1,8);
			agregarPacDot(3,8);
			agregarPacDot(9,8);
			agregarPacDot(11,8);
			agregarPacDot(15,8);
			agregarPacDot(19,8);
			agregarPacDot(1,9);
			agregarPacDot(3,9);
			agregarPacDot(4,9);
			agregarPacDot(5,9);
			agregarPacDot(6,9);
			agregarPacDot(7,9);
			agregarPacDot(8,9);
			agregarPacDot(9,9);
			agregarPacDot(11,9);
			agregarPacDot(13,9);
			agregarPacDot(14,9);
			agregarPacDot(15,9);
			agregarPacDot(17,9);
			agregarPacDot(18,9);
			agregarPacDot(19,9);
			agregarPacDot(1,10);
			agregarPacDot(9,10);
			agregarPacDot(10,10);
			agregarPacDot(11,10);
			agregarPacDot(12,10);
			agregarPacDot(13,10);
			agregarPacDot(15,10);
			agregarPacDot(17,10);
			agregarPacDot(1,11);
			agregarPacDot(2,11);
			agregarPacDot(3,11);
			agregarPacDot(4,11);
			agregarPacDot(5,11);
			agregarPacDot(6,11);
			agregarPacDot(7,11);
			agregarPacDot(8,11);
			agregarPacDot(9,11);
			agregarPacDot(11,11);
			agregarPacDot(13,11);
			agregarPacDot(15,11);
			agregarPacDot(17,11);
			agregarPacDot(3,12);
			agregarPacDot(5,12);
			agregarPacDot(7,12);
			agregarPacDot(9,12);
			agregarPacDot(11,12);
			agregarPacDot(12,12);
			agregarPacDot(13,12);
			agregarPacDot(14,12);
			agregarPacDot(15,12);
			agregarPacDot(16,12);
			agregarPacDot(17,12);
			agregarPacDot(18,12);
			agregarPacDot(19,12);
			agregarPacDot(3,13);
			agregarPacDot(4,13);
			agregarPacDot(5,13);
			agregarPacDot(6,13);
			agregarPacDot(7,13);
			agregarPacDot(8,13);
			agregarPacDot(9,13);
			agregarPacDot(10,13);
			agregarPacDot(11,13);
			agregarPacDot(19,13);
			agregarPacDot(1,14);
			agregarPacDot(2,14);
			agregarPacDot(3,14);
			agregarPacDot(5,14);
			agregarPacDot(7,14);
			agregarPacDot(9,14);
			agregarPacDot(11,14);
			agregarPacDot(12,14);
			agregarPacDot(13,14);
			agregarPacDot(14,14);
			agregarPacDot(15,14);
			agregarPacDot(16,14);
			agregarPacDot(17,14);
			agregarPacDot(19,14);
			agregarPacDot(1,15);
			agregarPacDot(3,15);
			agregarPacDot(4,15);
			agregarPacDot(5,15);
			agregarPacDot(6,15);
			agregarPacDot(7,15);
			agregarPacDot(8,15);
			agregarPacDot(9,15);
			agregarPacDot(11,15);
			agregarPacDot(17,15);
			agregarPacDot(19,15);
			agregarPacDot(1,16);
			agregarPacDot(5,16);
			agregarPacDot(9,16);
			agregarPacDot(11,16);
			agregarPacDot(13,16);
			agregarPacDot(14,16);
			agregarPacDot(15,16);
			agregarPacDot(17,16);
			agregarPacDot(19,16);
			agregarPacDot(1,17);
			agregarPacDot(2,17);
			agregarPacDot(3,17);
			agregarPacDot(4,17);
			agregarPacDot(5,17);
			agregarPacDot(6,17);
			agregarPacDot(9,17);
			agregarPacDot(11,17);
			agregarPacDot(13,17);
			agregarPacDot(15,17);
			agregarPacDot(17,17);
			agregarPacDot(19,17);
			agregarPacDot(2,18);
			agregarPacDot(6,18);
			agregarPacDot(9,18);
			agregarPacDot(11,18);
			agregarPacDot(13,18);
			agregarPacDot(15,18);
			agregarPacDot(17,18);
			agregarPacDot(19,18);
			agregarPacDot(1,19);
			agregarPacDot(2,19);
			agregarPacDot(3,19);
			agregarPacDot(5,19);
			agregarPacDot(6,19);
			agregarPacDot(7,19);
			agregarPacDot(9,19);
			agregarPacDot(11,19);
			agregarPacDot(13,19);
			agregarPacDot(15,19);
			agregarPacDot(17,19);
			agregarPacDot(19,19);
			agregarPacDot(1,20);
			agregarPacDot(3,20);
			agregarPacDot(5,20);
			agregarPacDot(7,20);
			agregarPacDot(9,20);
			agregarPacDot(11,20);
			agregarPacDot(13,20);
			agregarPacDot(15,20);
			agregarPacDot(16,20);
			agregarPacDot(17,20);
			agregarPacDot(19,20);
			agregarPacDot(1,21);
			agregarPacDot(3,21);
			agregarPacDot(5,21);
			agregarPacDot(7,21);
			agregarPacDot(9,21);
			agregarPacDot(11,21);
			agregarPacDot(13,21);
			agregarPacDot(19,21);
			agregarPacDot(1,22);
			agregarPacDot(2,22);
			agregarPacDot(3,22);
			agregarPacDot(4,22);
			agregarPacDot(5,22);
			agregarPacDot(7,22);
			agregarPacDot(8,22);
			agregarPacDot(9,22);
			agregarPacDot(11,22);
			agregarPacDot(12,22);
			agregarPacDot(13,22);
			agregarPacDot(14,22);
			agregarPacDot(15,22);
			agregarPacDot(16,22);
			agregarPacDot(17,22);
			agregarPacDot(18,22);
			agregarPacDot(19,22);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}


	
	public void armarNivel3() {
		//TODO
		
	}

	
	

	@Override
	public Mapa getNivelArmado() {
		return nivel;
	}
	
	public void reset() {
		nivel = new Mapa();
	}
	
	/**
	 * Metodo que se encarga de agregar en el nivel, una celda en la posicion
	 * (x,y) pasadas por parámetro, con una entidad, tambien pasada por
	 * parámetro. Si la entidad es null, la celda se crea vacía.
	 * @param entity Es la entidad que estará en la celda. Si es nula,
	 * la celda se creará vacía.
	 * @param x Es la coordenada x de la celda en el mapa.
	 * @param y Es la coordenada y de la celda en el mapa.
	 */
	private void agregarPacDot(int x, int y) throws Exception{
		Celda cel;
		Entidad pac;
		
		cel = miFabrica.construirCelda(x,y);
		pac = miFabrica.construirPacDot(cel,nivel);
		
		cel.add(pac);
		nivel.addContador();
		nivel.agregarCelda(cel);
	}
	
	private void agregarJugador(int x,int y) throws Exception{
		Celda cel;
		Entidad personaje;
		
		cel = miFabrica.construirCelda(x,y);
		personaje = miFabrica.construirJugador(cel,nivel);
		
		cel.add(personaje);
		nivel.agregarCelda(cel);
	}
}
