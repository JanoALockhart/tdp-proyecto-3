package logica.entidades;

import logica.entidades.visitadores.*;

public interface Element {
	public void accept(Visitor v);
}
