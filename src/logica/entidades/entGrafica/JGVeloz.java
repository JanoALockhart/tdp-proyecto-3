package logica.entidades.entGrafica;

import java.util.Properties;

import logica.entidades.Personaje.Personaje;

public class JGVeloz extends EstadoGrafico{
	
	public JGVeloz(Properties file) {
		super(file);
	}

	@Override
	public String getImgGirada(int dir) {
		String img=null;
		
		switch(dir) {
			case Personaje.NORTE: img = fileDirs.getProperty("jugadorVelozNORTE");break;
			case Personaje.ESTE: img = fileDirs.getProperty("jugadorVelozESTE");break;
			case Personaje.OESTE: img = fileDirs.getProperty("jugadorVelozOESTE");break;
			case Personaje.SUR: img = fileDirs.getProperty("jugadorVelozSUR");break;
		}
		
		return img;
	}
}
