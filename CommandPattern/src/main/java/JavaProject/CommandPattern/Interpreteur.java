package JavaProject.CommandPattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



/**
 * @ Cylia ADOUANE @ Ouiza HELLAL
 */

public class Interpreteur {
		private Stack<Undoable> historique;
		private Switch interrupteur;
		private List<String> liste;
		
		public Interpreteur() {
			this.historique = new Stack<Undoable>();
			this.interrupteur = new Switch();
			this.liste = new ArrayList<String>();
		}
		
		/**
		 * Executer une commande
		 */
		
		private void execCommand(Command command) {
			command.apply();
		}	
		
		public void execStore(Undoable command) {
			command.apply();
			this.historique.add(command);	
			
		}
		
		public void undo() {
			this.execCommand(new Undo(historique));
		}
		
		public void log(String string) {
			this.execCommand(() -> liste.add(string));
		}
		
		public String getLastInListe() {
			return liste.get(liste.size() - 1);
		}
		
		public void shutdown() {
			this.execCommand(new Quit(interrupteur));
		}
		
		public boolean ouvert() {
			return interrupteur.ouvert();
		}
		
	}

	


