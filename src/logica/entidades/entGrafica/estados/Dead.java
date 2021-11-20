package logica.entidades.entGrafica.estados;

import java.util.Properties;

import logica.entidades.Personaje.Personaje;

public class Dead extends EstadoGrafico{
	
	public Dead(Properties file) {
		super(file);
	}
	
	public String getImgGirada(int dir) {
		String img=null;
		
		switch(dir) {
			case Personaje.NORTE: img = fileDirs.getProperty("deadNORTE");break;
			case Personaje.ESTE: img = fileDirs.getProperty("deadESTE");break;
			case Personaje.OESTE: img = fileDirs.getProperty("deadOESTE");break;
			case Personaje.SUR: img = fileDirs.getProperty("deadSUR");break;
		}
		
		return img;
	}
}
