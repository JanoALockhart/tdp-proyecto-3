package logica.entidades;

import logica.entidades.visitadores.*;

public interface Element {
	
	/**
	 * Este m�todo acepta un Visitor
	 * @param v Es el visitor con el que se visitar�
	 */
	public void accept(Visitor v);
}
