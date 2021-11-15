package logica.entidades;

import logica.entidades.visitadores.*;

public interface Element {
	
	/**
	 * Este método acepta un Visitor
	 * @param v Es el visitor con el que se visitará
	 */
	public void accept(Visitor v);
}
