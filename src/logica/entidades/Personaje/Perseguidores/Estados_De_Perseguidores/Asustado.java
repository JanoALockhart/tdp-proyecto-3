package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import java.util.Random;

import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.visitadores.Visitor;
import logica.geometria.Pixel;
import logica.mapa.Celda;
import logica.partida.Partida;
import main.Main;

public class Asustado extends StatePerseguidor {

	protected TimerAsustado miTimerAsustado;
	
	
	public Asustado(Perseguidor fantasma) {
		super(fantasma);
	}

	@Override
	public Pixel calcularObj() {
		Pixel obj=null;
		int descartados=0;
		boolean encontrada=false;
		Pixel pos = miFantasma.getPos();
		Random randomizer = new Random();
		int dir = randomizer.nextInt(4); //Los numeros random van de 0 a 3 como las direcciones de personaje
		
		//verificamos que pueda moverse en esa direccion
		//si no puede elegimos la siguiente y probamos de nuevo
		//hasta encontrar una direccion en la que pueda avanzar
		
		while(descartados<4 && !encontrada) {
			if((dir!=(miFantasma.getDireccion()+2)%4) && miFantasma.verificarCambioDireccion(dir)) {
				encontrada = true;
			}else {
				dir=(dir+1)%4;
				descartados++;
			}
		}
		
		//Segun la direccion obtenida calcular el pixel objetivo
		switch(dir) {
			case Personaje.NORTE: obj = new Pixel(pos.getX(),pos.getY()-1);break;
			case Personaje.ESTE: obj = new Pixel(pos.getX()+1,pos.getY());break;
			case Personaje.SUR: obj = new Pixel(pos.getX(),pos.getY()+1);break;
			case Personaje.OESTE: obj = new Pixel(pos.getX()-1,pos.getY());break;
		}
		return obj;
	}


	@Override
	public void activarEfecto() {
		miFantasma.morir();
	}

}
