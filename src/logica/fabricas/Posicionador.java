package logica.fabricas;

import logica.mapa.Celda;

/**
 * Esta clase es responsable de llevar a cabo los calculos
 * necesarios para determinar la posicion y dimensiones de una 
 * entidad grafica según el tamaño indicado y la celda en la 
 * que se encuentra.
 */
public class Posicionador {
	private int ancho;
	private int alto;
	private int posX;
	private int posY;
	
	/**
	 * Realiza los calculos para posicionar la entidad grafica tomando
	 * como referencia la celda y el tamaño que se quiere
	 * @param c Es la celda en la que se posicionará el elemento grafico
	 * @param factorDivisor Determina cuan grande o pequeña es la entidad
	 * grafica. El valor 1 provoca que tenga las mismas dimensiones que una
	 * celda. A medida que es más grande, la imágen será más pequeña.
	 */
	public Posicionador(Celda c, int factorDivisor) {
		ancho = c.getAncho()/factorDivisor;
		alto = c.getAlto()/factorDivisor;
		posX = c.getX() * c.getAncho() + c.getAncho()/2 - ancho/2; 
		posY = c.getY() * c.getAlto() + c.getAlto()/2 - alto/2;
	}
	/**
	 * Método que devuelve la posicion x calculada
	 * @return La posicion x calculada
	 */
	public int getX() {
		return posX;
	}
	
	/**
	 * Método que devuelve la posicion y calculada
	 * @return La posicion y calculada
	 */
	public int getY() {
		return posY;
	}
	
	/**
	 * Método que devuelve el alto calculado
	 * @return El alto calculado
	 */
	public int getAlto() {
		return alto;
	}
	
	/**
	 * Método que devuelve el ancho calculado
	 * @return El ancho calculado
	 */
	public int getAncho() {
		return ancho;
	}
	
	
}
