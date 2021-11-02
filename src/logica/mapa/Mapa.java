package logica.mapa;

import java.util.LinkedList;

import logica.entidades.Entidad;

public class Mapa {
	private Celda misCeldas[][];
	private int cantPacDots;
	//private Asustador asusPerseguidores;
	
	private static final int ALTO = 32;
	private static final int ANCHO = 28;
	
	/**
	 * Constructor de la clase Mapa
	 */
	public Mapa() {
		//TODO inicializar el asustador
		//TODO ver dimensiones
		misCeldas = new Celda[ANCHO][ALTO];
		cantPacDots = 0;
	}
	
	/**
	 * Metodo que devuelve la celda ubicada en las coordenadas
	 * pasadas por parámetro. Si las coordenadas se encuentran
	 * fuera de rango retorna NULL.
	 * @param x Es la componente x del par de coordenadas
	 * @param y Es la componente y del par de coordenadas
	 * @return La celda ubicada en la posicion (x,y). Si no hay una
	 * celda en esa posicion, o las coordenadas están fuera de la matriz
	 * devuelve NULL.
	 */
	public Celda getCelda(int x, int y) {
		Celda cel = null;
		
		if(0<=x && x<=Mapa.ANCHO && 0<=y && y<=ALTO) {
			cel = misCeldas[x][y];
		}
		
		return cel;
	}
	
	/**
	 * Metodo que retorna la celda inmediatamente arriba
	 * de la celda indicada. Si la celda a obtener cae fuera
	 * de los límites, retorna null.
	 * @param c Es la celda que se toma como referencia para devolver
	 * la que está encima suyo. 
	 * @return La celda encima de la celda indicada por parámetro.
	 * Si se cae de los límites o no hay celda, retorna null.
	 */
	public Celda getCeldaArriba(Celda c) {
		Celda cel = null;
		
		if(0<=c.getY()-1) {
			cel = misCeldas[c.getX()][c.getY()-1];
		}
		
		return cel;
	}
	
	/**
	 * Metodo que retorna la celda inmediatamente a la derecha
	 * de la celda indicada. Si la celda a obtener cae fuera
	 * de los límites, retorna null.
	 * @param c Es la celda que se toma como referencia para devolver
	 * la que está a su derecha. 
	 * @return La celda encima de la celda indicada por parámetro.
	 * Si se cae de los límites o no hay celda, retorna null.
	 */
	public Celda getCeldaDerecha(Celda c) {
		Celda cel = null;
		
		if(c.getX()+1<=ANCHO) {
			cel = misCeldas[c.getX()+1][c.getY()];
		}
		
		return cel;
	}
	
	
	/**
	 * Metodo que retorna la celda inmediatamente abajo
	 * de la celda indicada. Si la celda a obtener cae fuera
	 * de los límites, retorna null.
	 * @param c Es la celda que se toma como referencia para devolver
	 * la que está abajo. 
	 * @return La celda encima de la celda indicada por parámetro.
	 * Si se cae de los límites o no hay celda, retorna null.
	 */
	public Celda getCeldaAbajo(Celda c) {
		Celda cel = null;
		
		if(c.getY()+1<=ALTO) {
			cel = misCeldas[c.getX()][c.getY()+1];
		}
		
		return cel;
	}
	
	/**
	 * Metodo que retorna la celda inmediatamente a la izquierda
	 * de la celda indicada. Si la celda a obtener cae fuera
	 * de los límites, retorna null.
	 * @param c Es la celda que se toma como referencia para devolver
	 * la que está a izquierda 
	 * @return La celda encima de la celda indicada por parámetro.
	 * Si se cae de los límites o no hay celda, retorna null.
	 */
	public Celda getCeldaIzquierda(Celda c) {
		Celda cel = null;
		
		if(0<=c.getX()-1) {
			cel = misCeldas[c.getX()-1][c.getY()];
		}
		
		return cel;
	}
	
	/**
	 * Metodo que devuelve las celdas no nulas adyacentes a
	 * la celda indicada por parámetro
	 * @param centro Es la celda de la que se obtendran las celdas adyacentes
	 * @return Un Iterable de celdas, con las celdas adyacentes no nulas
	 */
	public Iterable<Celda> getCeldasAdyacentes(Celda centro){
		Celda celAdy;
		LinkedList<Celda> celdasAdy = new LinkedList<Celda>();
		
		celAdy = this.getCeldaArriba(centro);
		if(celAdy!=null) {
			celdasAdy.add(celAdy);
		}
		
		celAdy = this.getCeldaDerecha(centro);
		if(celAdy!=null) {
			celdasAdy.add(celAdy);
		}
		
		celAdy = this.getCeldaAbajo(centro);
		if(celAdy!=null) {
			celdasAdy.add(celAdy);
		}
		
		celAdy = this.getCeldaIzquierda(centro);
		if(celAdy!=null) {
			celdasAdy.add(celAdy);
		}
		
		return celdasAdy;
	}
	
	/**
	 * Metodo que devuelve todas las entidades que se encuentren en la celda
	 * indicada y a una celda de distancia de la misma, es decir, la de arriba,
	 * derecha, izquierda y abajo.
	 * @param centro Es la celda central desde la que se obtendran las entidades
	 * de las celdas adyacentes.
	 * @return Un Iterable con las entidades encontradas en el rango
	 */
	public Iterable<Entidad> getEntidadesCircundantes(Celda centro){
		LinkedList<Entidad> entidades = new LinkedList<Entidad>();
		
		for(Entidad ent : centro.getEntidades()) {
			entidades.add(ent);
		}
		
		for(Celda celAdyacente : getCeldasAdyacentes(centro)) {
			for(Entidad ent : celAdyacente.getEntidades()) {
				entidades.add(ent);
			}
		}
		
		return entidades;
	}
	
	
	public void asustarPerseguidores() {
		//TODO activar el observer Asustador
	}
	
	public void agregarCelda(Celda c) throws Exception{
		try {
			misCeldas[c.getX()][c.getY()]=c;
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new Exception("Celda ("+c.getX()+","+c.getY()+") no se puede ubicar");
		}
	}
	
	//TODO ver si es necesario
	public void agregarEntidad(Entidad e) {
		
	}
	
}
