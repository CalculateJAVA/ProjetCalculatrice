package JavaProject.CommandPattern;
import java.util.Stack;
/**
*@ Cylia ADOUANE  @ Ouiza HELLAL
	 *  historique et commande
	 */

public class Undo implements Command {
	private Undoable lastCommand;
	public Undo(Stack<Undoable> historique) {
		GestionExcept.handleStackSize(historique.size(), 1);
			this.lastCommand = historique.pop();
		}
	
	    
	    @Override
		public void apply() {
			lastCommand.undo();		
		}  


}
