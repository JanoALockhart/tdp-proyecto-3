package logica.geometria;

import java.awt.Rectangle;

public class HitBox {
	private Rectangle rectangulo;
	
	public HitBox(int x, int y, int width, int height) {
		rectangulo = new Rectangle(x,y,width,height);
	}
	
	public int getHeight() {
		return (int) rectangulo.getHeight();
	}
	
	public int getWidth() {
		return (int) rectangulo.getWidth();
	}
	
	public int getX() {
		return (int) rectangulo.getX();
	}
	
	public int getY() {
		return (int) rectangulo.getY();
	}
	
	public boolean intersects(HitBox hb) {
		Rectangle rec = new Rectangle(hb.getX(), hb.getY(), hb.getHeight(), hb.getWidth());
		return rectangulo.intersects(rec);
	}
	
	public Pixel getPixelSuperiorIzquierdo() {
		Pixel toReturn = new Pixel(getX(),getY());
		return toReturn;
	}
	
	public Pixel getPixelInferiorIzquierdo() {
		Pixel toReturn = new Pixel(getX(),getY()+getHeight());
		return toReturn;
	}
	
	public Pixel getPixelSuperiorDerecho() {
		Pixel toReturn = new Pixel(getX()+getWidth(),getY());
		return toReturn;
	}
	
	public Pixel getPixelInferiorDerecho() {
		Pixel toReturn = new Pixel(getX()+getWidth(),getY()+getHeight());
		return toReturn;
	}
	
	public HitBox clone() {
		return new HitBox(getX(),getY(),getWidth(),getHeight());
	}
	
	public String toString() {
		return rectangulo.toString();
	}
	
}
