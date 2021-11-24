package logica.mapa;
import java.util.*;

import logica.entidades.Entidad;
import logica.entidades.Personaje.Personaje;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.Visitor;
import logica.geometria.HitBox;
import logica.geometria.Pixel;
import logica.partida.Partida;
import main.Main;

/**
 * La clase Mapa tiene la responsabilidad de alojar a todas las celdas
 * caminables en sus posiciones asignadas y efectuar colisiones entre
 * paredes con entidades, ente entidades, y entre celdas y entidades
 */
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
	public Iterable<Entidad<? extends EntidadGrafica>> getEntidadesCircundantes(Entidad<? extends EntidadGrafica> entity){
		HashSet<Entidad<? extends EntidadGrafica>> conjEntidades = new HashSet<Entidad<? extends EntidadGrafica>>();
		
		
		//Almacenamos todas las entidades de las celda que toca la entidad ingresada por parametro
		for(Celda cel : getCeldasTocadasPor(entity.getHitbox())) {
			for(Entidad<? extends EntidadGrafica> ent : cel.getEntidades()) {
				conjEntidades.add(ent);
			}
		}
		
		return conjEntidades;
	}
	
	/**
	 * Metodo que agrega una celda en la poscion que tiene almacenada
	 * Lanza una excepción si las posiciones de la celda están fuera de
	 * los limites del mapa
	 * @param c Es la celda que se quiere agregar
	 * @throws Exception Es lanzada cuando la celda que se quiere agregar
	 * tiene una posicion fuera de rango
	 */
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
	public Iterable<Entidad<? extends EntidadGrafica>> getTodasLasEntidades(){
		LinkedList<Entidad<? extends EntidadGrafica>> entidades = new LinkedList<Entidad<? extends EntidadGrafica>>();
		for(int posX=0; posX<ANCHO; posX++) {
			for(int posY=0; posY<ALTO; posY++) {
				if(misCeldas[posX][posY]!=null) {
					for(Entidad<? extends EntidadGrafica> ent : misCeldas[posX][posY].getEntidades()) {
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
	public boolean verificarMovimiento(int direccion, HitBox hitBox) {
		boolean puedeAvanzar=true;
		
		Pixel esqSupIzq = hitBox.getPixelSuperiorIzquierdo();
		Pixel esqSupDer = hitBox.getPixelSuperiorDerecho();
		Pixel esqInfDer = hitBox.getPixelInferiorDerecho();
		Pixel esqInfIzq = hitBox.getPixelInferiorIzquierdo();
		
		/*Para la dirección correspondiente, si la celda a la que pertenecen los pixeles a los 
		 * que se quiere avanzar no son caminables, entonces no se puede avanzar. 
		 * Ejemplo: si se quiere avanzar hacia el norte, se corroborarán las celda en la que están
		 * los píxeles inmediantamente encima de las esquinas superior derecha y superior izquierda
		 * Esto es análogo al resto de las direcciones*/
		switch(direccion) {
			case Personaje.NORTE:{
				if(misCeldas[esqSupDer.getX()/ANCHO_CELDA][(esqSupDer.getY()-1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[esqSupIzq.getX()/ANCHO_CELDA][(esqSupIzq.getY()-1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				break;
			}
			
			case Personaje.ESTE:{
				if(misCeldas[(esqSupDer.getX()+1)/ANCHO_CELDA][esqSupDer.getY()/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[(esqInfDer.getX()+1)/ANCHO_CELDA][esqInfDer.getY()/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				break;
			}
			
			case Personaje.SUR:{
				if(misCeldas[esqInfIzq.getX()/ANCHO_CELDA][(esqInfIzq.getY()+1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[esqInfDer.getX()/ANCHO_CELDA][(esqInfDer.getY()+1)/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}

				break;
			}
			
			case Personaje.OESTE:{
				if(misCeldas[(esqInfIzq.getX()-1)/ANCHO_CELDA][esqInfIzq.getY()/ALTO_CELDA]==null) {
					puedeAvanzar = false;
				}
				if(misCeldas[(esqSupIzq.getX()-1)/ANCHO_CELDA][esqSupIzq.getY()/ALTO_CELDA]==null) {
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
	 * en todas las celdas que son tocadas por la hitbox actual. Este método es 
	 * sincronizado para evitar que una entidad que se movió no detecte a otra
	 * entidad en las mismas celdas que tocaba pero que está siendo reposicionada
	 * @param entidad Es la entidad que se quiere eliminar de las celdas que ya no
	 * toca y colocar en las celdas que toca.
	 * @param hitBoxVieja Es el area de
	 */
	public synchronized void reposicionar(Entidad<? extends EntidadGrafica> entidad, HitBox hitBoxVieja) {
		eliminarDeCeldasQueTocaba(entidad,hitBoxVieja);
		colocarEnCeldasQueToca(entidad);
	}
	
	/**
	 * Metodo que agrega la entidad, las celdas que toca su hitbox
	 * @param entidad Es la entidad que se debe agregar a las celdas que toca
	 */
	public void colocarEnCeldasQueToca(Entidad<? extends EntidadGrafica> entidad) {
		for(Celda cel : getCeldasTocadasPor(entidad.getEntidadGrafica().getRect())) {
			cel.add(entidad);
		}
	}
	
	/**
	 * Metodo que elimina la Entidad entity, de todas las celdas que toca
	 * el rectángulo hitBoxAnterior
	 * @param entidad Es la entidad que se quiere eliminar de las celdas
	 * @param hitBoxAnterior Es el area que ocupaba la entidad
	 */
	public void eliminarDeCeldasQueTocaba(Entidad<? extends EntidadGrafica> entidad, HitBox hitBoxAnterior) {	
		try {
			for(Celda cel : getCeldasTocadasPor(hitBoxAnterior)) {
				cel.remove(entidad);
			}
		}catch(NullPointerException e) {
			System.out.println("HB anterior: "+hitBoxAnterior);
			System.out.println("HB Now:"+entidad.getHitbox());
		}
	}
	
	/**
	 * Metodo que realiza las colisiones de la entidad pasada por parámetro
	 * con todas las entidades que se encuentren en las celdas que toca
	 * la entidad. Es sincrónico para que no acceda más de un hilo a la vez y
	 * cause problemas al momento de recorrer las entidades de la celda
	 * @param entity Es la entidad con la que se verificará las colisiones con
	 * otras entidades.
	 */
	public synchronized void efectuarColisiones(Entidad<? extends EntidadGrafica> entity) {
		Visitor visitador;
		
		//Colisionar entidades
		for(Entidad<? extends EntidadGrafica> entEncontrada:getEntidadesCircundantes(entity)) {
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
	private Iterable<Celda> getCeldasTocadasPor(HitBox rec) {
		
		HashSet<Celda> conjuntoCeldas = new HashSet<Celda>();
		
		Pixel esqSupIzq = rec.getPixelSuperiorIzquierdo();	
		Pixel esqInfDer = rec.getPixelInferiorDerecho();
		
		int x1 = esqSupIzq.getX()/ANCHO_CELDA;
		int x2 = esqInfDer.getX()/ANCHO_CELDA;
		int y1 = esqSupIzq.getY()/ALTO_CELDA;
		int y2 = esqInfDer.getY()/ALTO_CELDA;
		
		
		for(int x = x1; x<=x2; x++) {
			for(int y = y1; y<=y2; y++) {
				if(0<=x && x<ANCHO && 0<=y && y<ALTO && misCeldas[x][y]!=null) {//SI no se sale de los limites del mapa
					conjuntoCeldas.add(misCeldas[x][y]);
				}
			}
		}
		
		return conjuntoCeldas;
	}

	
}
