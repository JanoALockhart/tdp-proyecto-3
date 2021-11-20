package logica.entidades.entGrafica.estados;

import java.util.Properties;

import logica.entidades.Personaje.Personaje;

public class Veloz extends EstadoGrafico{
	
	public Veloz(Properties file) {
		super(file);
	}

	@Override
	public String getImgGirada(int dir) {
		String img=null;
		
		switch(dir) {
			case Personaje.NORTE: img = fileDirs.getProperty("velozNORTE");break;
			case Personaje.ESTE: img = fileDirs.getProperty("velozESTE");break;
			case Personaje.OESTE: img = fileDirs.getProperty("velozOESTE");break;
			case Personaje.SUR: img = fileDirs.getProperty("velozSUR");break;
		}
		
		return img;
	}
}
