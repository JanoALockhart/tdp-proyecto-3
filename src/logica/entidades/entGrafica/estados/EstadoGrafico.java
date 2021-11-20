package logica.entidades.entGrafica.estados;

import java.util.Properties;

public abstract class EstadoGrafico {
	protected Properties fileDirs;
	
	public EstadoGrafico(Properties file) {
		fileDirs = file;
	}
	
	
	public abstract String getImgGirada(int dir);
}
