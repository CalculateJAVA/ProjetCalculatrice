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

		
		
		
	/**
	* appliquer une opération sur les deux dernières opérandes de la pile
	*/
		
	public void appliquerOp(Operation op) {
		this.execStore(new OpCommand(pile, op));
	}

		
	/**
	* afficher les opérandes de la pile
	*/
		
	public String affichagePile() {
		String str = "[";
		for (Double d : this.pile) {
			str += (d + " ");
		}	
		return str.trim() + "]";
	}

		
		
	/** 
	* retourner la taille de la pile 
	*/
	public int getSizePile(){
		return this.pile.size();
	}
	
	
	

}
