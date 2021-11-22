package logica.fabricas;

import logica.mapa.Celda;

/**
 * Esta clase es responsable de llevar a cabo los calculos
 * necesarios para determinar la posicion y dimensiones de una 
 * entidad grafica seg�n el tama�o indicado y la celda en la 
 * que se encuentra.
 */
public class Posicionador {
	private int ancho;
	private int alto;
	private int posX;
	private int posY;
	
	/**
	 * Realiza los calculos para posicionar la entidad grafica tomando
	 * como referencia la celda y el tama�o que se quiere
	 * @param c Es la celda en la que se posicionar� el elemento grafico
	 * @param factorDivisor Determina cuan grande o peque�a es la entidad
	 * grafica. El valor 1 provoca que tenga las mismas dimensiones que una
	 * celda. A medida que es m�s grande, la im�gen ser� m�s peque�a.
	 */
	public Posicionador(Celda c, int factorDivisor) {
		ancho = c.getAncho()/factorDivisor;
		alto = c.getAlto()/factorDivisor;
		posX = c.getX() * c.getAncho() + c.getAncho()/2 - ancho/2; 
		posY = c.getY() * c.getAlto() + c.getAlto()/2 - alto/2;
	}
	/**
	 * M�todo que devuelve la posicion x calculada
	 * @return La posicion x calculada
	 */
	public int getX() {
		return posX;
	}
	
	/**
	 * M�todo que devuelve la posicion y calculada
	 * @return La posicion y calculada
	 */
	public int getY() {
		return posY;
	}
	
	/**
	 * M�todo que devuelve el alto calculado
	 * @return El alto calculado
	 */
	public int getAlto() {
		return alto;
	}
	
	/**
	 * M�todo que devuelve el ancho calculado
	 * @return El ancho calculado
	 */
	public int getAncho() {
		return ancho;
	}
	
	
}
