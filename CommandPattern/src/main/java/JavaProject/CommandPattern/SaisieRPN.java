package JavaProject.CommandPattern;
import java.util.Scanner;

/**
 * Gèrer la saisie RPN.
 */


public class SaisieRPN {
	
	private MoteurRPN m;
	private Scanner scan;

		public SaisieRPN(){
			m = new MoteurRPN();
		}

		/**
		 * Initialiser le Scanner
		 */
		public void initScanner(Scanner scan) {
			this.scan = scan;		
		}

		/**
		 * Fermer le Scanner
		 */
		public void fermerScanner() {
			scan.close();
		}

		
}
