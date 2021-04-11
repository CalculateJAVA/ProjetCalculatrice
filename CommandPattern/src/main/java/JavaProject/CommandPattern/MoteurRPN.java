package JavaProject.CommandPattern;
import java.util.Stack;

/**
 * gerer la pile
 * @ Cylia ADOUANE @ Ouiza HELLAL 
 */


public class MoteurRPN extends Interpreteur{

	private Stack<Double> pile;

	/**
	* Creation de la pile
	*/
	public MoteurRPN() {
		this.pile = new Stack<Double>();
	}

		
		
	/**
	* ajouter une opérande dans la pile
	*/
	public void enregistrerNb(double nombre) {
		this.execStore(new Store(pile, nombre));
	}

		
		
		

	
	
	

}
