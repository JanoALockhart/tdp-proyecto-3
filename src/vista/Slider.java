package vista;

public class Slider<E> {

	private E[] options;
	
	private int sliderSelection;
	
	public Slider(int nroOptions){
		sliderSelection=0;
		options=(E[]) new Object[nroOptions];
	}
	
	public Slider(int nroOptions, int sliderAt){
		sliderSelection=sliderAt;
		options=(E[]) new Object[nroOptions];
	}
	
	public void setOptionAtN(E option, int n) {
		options[--n]=option;
	}
	
	public void slideClockwise() {
		sliderSelection++;
		sliderSelection=sliderSelection%options.length;	
	}
	
	public void slideAnticlockwise() {
		sliderSelection--;
		sliderSelection=sliderSelection==-1?options.length-1:sliderSelection%options.length;
	}
	
	public int getSliderSelection() {
		return Math.abs(sliderSelection);
	}
	
	public E getOptionSelected() {
		return options[Math.abs(sliderSelection)];
	}
	
	public E getOptionAtN(int n) {
		return options[--n];
	}
}
