package vista;

import javax.swing.JPanel;

public interface State {
	
	/**	
	 * Se apreto la tecla D
	 */
	public void seApretoDerecha();
	
	/**	
	 * Se apreto la tecla A
	 */
	public void seApretoIzquierda();

	/**	
	 * Se apreto la tecla S
	 */
	public void seApretoAbajo();

	/**	
	 * Se apreto la tecla W
	 */
	public void seApretoArriba();

	/**	
	 * Se apreto la tecla Enter
	 */
	public void seApretoEnter();

	/**	
	 * Se apreto la barra espaciadora
	 */
	public void seApretoEspacio();

	/**	
	 * Se actualizan todas las imagenes
	 */
	public void refrescarLabels();
	
	/**
	 * Se muteo la música
	 */
	public void seApretoP(boolean pause);	
	
	/**	
	 * Devuelve el panel contenedor del contenido gráfico
	 * @return El panel contenedor del contenido gráfico
	 */
	public JPanel getPanel();

	/**
	 * Devuelve el nombre del Estado que se nombro para las LayoutCards
	 * @return Nombre de la LayoutCard
	 */
	public String getName();
	
}
