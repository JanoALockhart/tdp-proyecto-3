package logica.mapa;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.*;

import logica.entidades.Entidad;
import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.visitadores.Visitor;
import logica.partida.Partida;
import main.Main;

public class Mapa {
	private Celda misCeldas[][];
	private int cantCollectibles;
	//private Asustador asusPerseguidores;
	
	private static final int ALTO = 24;
	private static final int ANCHO = 21;
	
	private static final int ALTO_CELDA = Integer.parseInt(Main.dimentionConfig.getProperty("altoCelda"));
	private static final int ANCHO_CELDA = Integer.parseInt(Main.dimentionConfig.getProperty("anchoCelda"));
	
	/**
	 * Constructor de la clase Mapa
	 */
	public Mapa() {
		//TODO inicializar el asustador
		//TODO ver dimensiones
		misCeldas = new Celda[ANCHO][ALTO];
		cantCollectibles = 0;
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
	 * Metodo que devuelve todas las entidades que se encuentren en la celda
	 * indicada y a una celda de distancia de la misma, es decir, la de arriba,
	 * derecha, izquierda y abajo.
	 * @param centro Es la celda central desde la que se obtendran las entidades
	 * de las celdas adyacentes.
	 * @return Un Iterable con las entidades encontradas en el rango
	 */
	public Iterable<Entidad> getEntidadesCircundantes(Entidad entity){
		HashSet<Entidad> conjEntidades = new HashSet<Entidad>();
		
		
		//Almacenamos todas las entidades de las celda que toca la entidad ingresada por parametro
		for(Celda cel : getCeldasTocadasPor(entity.getHitbox())) {
			for(Entidad ent : cel.getEntidades()) {
				conjEntidades.add(ent);
			}
		}
		
		return conjEntidades;
	}
	
	
	public void agregarCelda(Celda c) throws Exception{
		try {
			misCeldas[c.getX()][c.getY()]=c;
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new Exception("Celda ("+c.getX()+","+c.getY()+") no se puede ubicar");
		}
	}
	
	/**
	 * Metodo que crea una lista con todas las entidades en el mapa.
	 * Solo es usado para mostrar todas las entidades cuando se crea un nuevo nivel.
	 * @return Una coleccion de entidades.
	 */
	public Iterable<Entidad> getTodasLasEntidades(){
		LinkedList<Entidad> entidades = new LinkedList<Entidad>();
		for(int posX=0; posX<ANCHO; posX++) {
			for(int posY=0; posY<ALTO; posY++) {
				if(misCeldas[posX][posY]!=null) {
					for(Entidad ent : misCeldas[posX][posY].getEntidades()) {
						entidades.add(ent);
					}
				}
			}
		}
		return entidades;
	}
	
	/**
	 * Metodo que aumenta en 1 la cantidad de collectibles 
	 * que se cuentan en el mapa
	 */
	public void addContador() {
		cantCollectibles++;
	}
	
	/**
	 * Metodo que disminuye en 1 la cantidad de collectibles
	 * que se encuentran en el mapa
	 */
	public void subContador() {
		cantCollectibles--;
		if(cantCollectibles==0)
			Partida.getInstance().siguienteNivel();
	}
	
	/**
	 * Verifica si el personaje indicado por parámetro puede moverse en la 
	 * dirección en la que mira.
	 * @param character Es el personaje que se corroborará si puede avanzar.
	 * @return True si el personaje puede moverse, false en caso contrario.
	 */
	public boolean verificarMovimiento(int direccion, Rectangle hitBox) {
		boolean puedeAvanzar=true;
		
		Point esqSupIzq = hitBox.getLocation();	
		Point esqSupDer = new Point((int) (esqSupIzq.getX()+hitBox.getWidth()), (int) esqSupIzq.getY());
		Point esqInfDer = new Point((int) (esqSupIzq.getX()+hitBox.getWidth()), (int) (esqSupIzq.getY()+hitBox.getHeight()));
		Point esqInfIzq = new Point((int) (esqSupIzq.getX()), (int) (esqSupIzq.getY()+hitBox.getHeight()));
		
		/*Para la dirección correspondiente, si la celda a la que pertenecen los pixeles a los 
		 * que se quiere avanzar no son caminables, entonces no se puede avanzar. 
		 * Ejemplo: si se quiere avanzar hacia el norte, se corroborarán las celda en la que están
		 * los píxeles inmediantamente encima de las esquinas superior derecha y superior izquierda
		 * Esto es análogo al resto de las direcciones*/
		switch(direccion) {
			case Personaje.NORTE:{
				if(misCeldas[((int)esqSupDer.getX())/ANCHO_CELDA][((int)esqSupDer.getY()-1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[((int)esqSupIzq.getX())/ANCHO_CELDA][((int)esqSupIzq.getY()-1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				break;
			}
			
			case Personaje.ESTE:{
				if(misCeldas[((int)esqSupDer.getX()+1)/ANCHO_CELDA][((int)esqSupDer.getY())/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[((int)esqInfDer.getX()+1)/ANCHO_CELDA][((int)esqInfDer.getY())/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				break;
			}
			
			case Personaje.SUR:{
				if(misCeldas[((int)esqInfIzq.getX())/ANCHO_CELDA][((int)esqInfIzq.getY()+1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[((int)  esqInfDer.getX())/ANCHO_CELDA][((int)esqInfDer.getY()+1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}

				break;
			}
			
			case Personaje.OESTE:{
				if(misCeldas[((int)esqInfIzq.getX()-1)/ANCHO_CELDA][((int)esqInfIzq.getY())/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[((int)esqSupIzq.getX()-1)/ANCHO_CELDA][((int)esqSupIzq.getY())/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				break;
			}
		}
		return puedeAvanzar;
	}
	
	/**
	 * Metodo sincronizado que elimina la referencia de la Entidad entity de
	 * todas las celdas que son tocadas por la hitBoxVieja y la coloca
	 * en todas las celdas que son tocadas por la hitbox actual
	 * @param entity Es la entidad que se quiere eliminar de las celdas que ya no
	 * toca y colocar en las celdas que toca.
	 * @param hitBoxVieja Es el area de
	 */
	public synchronized void reposicionar(Entidad entity, Rectangle hitBoxVieja) {
		eliminarDeCeldasQueTocaba(entity,hitBoxVieja);
		colocarEnCeldasQueToca(entity);
	}
	
	/**
	 * Metodo que agrega la entidad, las celdas que toca su hitbox
	 * @param entity Es la entidad que se debe agregar a las celdas que toca
	 */
	public void colocarEnCeldasQueToca(Entidad entity) {
		for(Celda cel : getCeldasTocadasPor(entity.getEntidadGrafica().getRect())) {
			cel.add(entity);
		}
	}
	
	/**
	 * Metodo que elimina la Entidad entity, de todas las celdas que toca
	 * el rectángulo hitBoxAnterior
	 * @param entity Es la entidad que se quiere eliminar de las celdas
	 * @param hitBoxAnterior Es el area que ocupaba la entidad
	 */
	public void eliminarDeCeldasQueTocaba(Entidad entity, Rectangle hitBoxAnterior) {	
		for(Celda cel : getCeldasTocadasPor(hitBoxAnterior)) {
			cel.remove(entity);
		}
	}
	
	/**
	 * Metodo que realiza las colisiones de la entidad pasada por parámetro
	 * con todas las entidades que se encuentren en las celdas que toca
	 * la entidad.
	 * @param entity Es la entidad con la que se verificará las colisiones con
	 * otras entidades.
	 */
	public void efectuarColisiones(Entidad entity) {
		Visitor visitador;
		
		//Colisionar entidades
		for(Entidad entEncontrada:getEntidadesCircundantes(entity)) {
			if(entEncontrada != entity && entEncontrada.colisionaCon(entity)) {
				visitador = entEncontrada.getVisitor();
				entity.accept(visitador);
				visitador = entity.getVisitor();
				entEncontrada.accept(visitador);
			}
		}
		
		
	}
	
	
	/**
	 * Metodo que devuelve un iterable de las celdas que intersectan
	 * con el rectángulo pasado por parámetro.
	 * @param rec Es el rectangulo de referencia
	 * @return Un iterable de celdas
	 */
	private Iterable<Celda> getCeldasTocadasPor(Rectangle rec) {
		HashSet<Celda> conjuntoCeldas = new HashSet<Celda>();
		
		Point esqSupIzq = rec.getLocation();	
		Point esqSupDer = new Point((int) (esqSupIzq.getX()+rec.getWidth()), (int) esqSupIzq.getY());
		Point esqInfDer = new Point((int) (esqSupIzq.getX()+rec.getWidth()), (int) (esqSupIzq.getY()+rec.getHeight()));
		Point esqInfIzq = new Point((int) (esqSupIzq.getX()), (int) (esqSupIzq.getY()+rec.getHeight()));
		
		conjuntoCeldas.add(misCeldas[(int)esqSupIzq.getX()/ANCHO_CELDA][(int)esqSupIzq.getY()/ALTO_CELDA]);
		conjuntoCeldas.add(misCeldas[(int)esqSupDer.getX()/ANCHO_CELDA][(int)esqSupDer.getY()/ALTO_CELDA]);
		conjuntoCeldas.add(misCeldas[(int)esqInfIzq.getX()/ANCHO_CELDA][(int)esqInfIzq.getY()/ALTO_CELDA]);
		conjuntoCeldas.add(misCeldas[(int)esqInfDer.getX()/ANCHO_CELDA][(int)esqInfDer.getY()/ALTO_CELDA]);
		
		return conjuntoCeldas;
	}
	
}
