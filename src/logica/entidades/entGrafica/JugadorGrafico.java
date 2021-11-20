package logica.entidades.entGrafica;

import java.util.Properties;

import logica.entidades.entGrafica.estados.Normal;
import logica.entidades.entGrafica.estados.Veloz;

public class JugadorGrafico extends PersonajeGrafico{

	public JugadorGrafico(Properties file, String img, int x, int y, int w, int h, int p) {
		super(file, img, x, y, w, h, p);
		miEstadoAct = new Normal(file);
	}
	
	public void setVeloz(int dir) {
		miEstadoAct = new Veloz(fileDirs);
		rotarSprite(dir);
	}
}
