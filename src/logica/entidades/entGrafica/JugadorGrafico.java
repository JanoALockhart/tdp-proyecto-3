package logica.entidades.entGrafica;

import java.util.Properties;

public class JugadorGrafico extends PersonajeGrafico{

	public JugadorGrafico(Properties file, String img, int x, int y, int w, int h, int p) {
		super(file, img, x, y, w, h, p);
		miEstadoAct = new JGNormal(file);
	}
	
	public void setNormal(int dir) {
		miEstadoAct = new JGNormal(fileDirs);
		rotarSprite(dir);
	}
	
	public void setVeloz(int dir) {
		miEstadoAct = new JGVeloz(fileDirs);
		rotarSprite(dir);
	}
}
