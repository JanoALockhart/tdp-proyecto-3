package logica.entidades.entGrafica.estados;

import java.util.Properties;


public class Miedoso extends EstadoGrafico{
	
	public Miedoso(Properties file) {
		super(file);
	}
	
	public String getImgGirada(int dir) {
		return fileDirs.getProperty("miedoso");
	}
}
