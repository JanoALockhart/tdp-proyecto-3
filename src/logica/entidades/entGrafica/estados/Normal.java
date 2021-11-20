package logica.entidades.entGrafica.estados;

import java.util.Properties;

import logica.entidades.Personaje.Personaje;

public class Normal extends EstadoGrafico{
	
	public Normal(Properties file) {
		super(file);
	}

	@Override
	public String getImgGirada(int dir) {
		String img=null;
		
		switch(dir) {
			case Personaje.NORTE: img = fileDirs.getProperty("normalNORTE");break;
			case Personaje.ESTE: img = fileDirs.getProperty("normalESTE");break;
			case Personaje.OESTE: img = fileDirs.getProperty("normalOESTE");break;
			case Personaje.SUR: img = fileDirs.getProperty("normalSUR");break;
		}
		
		return img;
	}
	
}
