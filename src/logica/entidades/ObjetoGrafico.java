package logica.entidades;

public interface ObjetoGrafico {
	public int getX();
	
	public int getY();
	
	public void moverPixel(int direccion);
	
	public int getWidth();
	
	public int getHeight();
	
	public void rotarSprite();
	
	public void setImg(String dir);
	
	public String getImg();
	
}
