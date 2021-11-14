package logica.geometria;

import java.awt.Point;

public class Pixel {
	private Point punto;
	
	public Pixel(int x, int y) {
		punto = new Point(x,y);
	}
	
	public int getX() {
		return (int) punto.getX();
	}
	
	public int getY() {
		return(int) punto.getY();
	}
	
	public String toString() {
		return punto.toString();
	}
	
	public double distanciaA(Pixel pxl) {
		double difX = Math.abs(pxl.getX() - getX());
		double difY = Math.abs(pxl.getY() - getY());
	
		return Math.sqrt(difX*difX + difY*difY);
	}
}
