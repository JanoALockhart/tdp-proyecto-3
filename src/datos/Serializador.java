package datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {
	private TopJugadores bestPlayers;
	
	//TODO preguntar si este casteo esta permitido
	public Serializador() {
		try {
			bestPlayers = new TopJugadores();
			FileInputStream fileInputStream = new FileInputStream("src/datos/puntajes.score");
		    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    bestPlayers = (TopJugadores) objectInputStream.readObject();
		    objectInputStream.close();
		    
		}catch(FileNotFoundException e){
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void guardarJugador(JugadorDatos player) {
		try {
			bestPlayers.add(player);
			FileOutputStream fileOutputStream = new FileOutputStream("src/datos/puntajes.score");
		    ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
		    objectOutputStream.writeObject(bestPlayers);
		    objectOutputStream.flush();
		    objectOutputStream.close();
		}catch(FileNotFoundException e){
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public Iterable<JugadorDatos> obtenerTopPlayers(){
		Iterable<JugadorDatos> toReturn=null;
		if(bestPlayers!=null) {
			toReturn = bestPlayers.getJugadores();
		}
		return toReturn;
	}
}
