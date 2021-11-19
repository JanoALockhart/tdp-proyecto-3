package logica.entidades.entGrafica;

import java.util.Properties;

import logica.entidades.Personaje.Personaje;

public class JGNormal extends EstadoGrafico{
	
	public JGNormal(Properties file) {
		super(file);
	}

	@Override
	public String getImgGirada(int dir) {
		String img=null;
		
		switch(dir) {
			case Personaje.NORTE: img = fileDirs.getProperty("jugadorNormalNORTE");break;
			case Personaje.ESTE: img = fileDirs.getProperty("jugadorNormalESTE");break;
			case Personaje.OESTE: img = fileDirs.getProperty("jugadorNormalOESTE");break;
			case Personaje.SUR: img = fileDirs.getProperty("jugadorNormalSUR");break;
		}
		
		return img;
	}
	
}
