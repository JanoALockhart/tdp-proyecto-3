package logica.entidades.entGrafica;

import java.util.Properties;

import logica.entidades.entGrafica.estados.Dead;
import logica.entidades.entGrafica.estados.Miedoso;
import logica.entidades.entGrafica.estados.Normal;

public class PerseguidorGrafico extends PersonajeGrafico{

	public PerseguidorGrafico(Properties file, String img, int x, int y, int w, int h, int p) {
		super(file,img,x,y,w,h,p);//TODO revisar prioridades
	}
	
	public void setAsustado(int dir) {
		miEstadoAct = new Miedoso(fileDirs);
		rotarSprite(dir);
	}
	
	public void setMuerto(int dir) {
		miEstadoAct = new Dead(fileDirs);
		rotarSprite(dir);
	}
}
