package JavaProject.CommandPattern;
import java.util.Stack;

public class Store implements Undoable {
		/* # RECEIVER: Stack<Double> */
		
	private double nombre;
	private Stack<Double> pile;
		
	public Store(Stack<Double> pile, double nombre) {
		this.pile = pile;
		this.nombre = nombre;		
	}
		
	@Override
	public void apply() {
		GestionExcept.gestionMinMax(nombre);
		this.pile.push(nombre);
	}
		
	@Override
	public void undo() {
		this.pile.pop();
	}

	

}
