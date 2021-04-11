package JavaProject.CommandPattern;
import java.util.Scanner;

/**
 * @ Cylia ADOUANE @ Ouiza HELLAL
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
		
		
		public void saisie() {
			this.initScanner(new Scanner(System.in));

			//String input = ""; 
			//String s = "";

			while(m.ouvert()) {
				System.out.println("Pour effectuer vos calculs ,veuillez Saisir soi un entier ou une opération ou bien exit pour sortir,tapez entrer");
				System.out.println(m.affichagePile());
			}

			// checkNombreOperations();

			System.out.println("Fin du programme");
			this.fermerScanner();    
		}
		
		
		
		//private boolean isOp(String str) {
		//	return this.renvoieOp(str) != null;
		//}
		
		
		
		/**
		 * Retourne une opération
		 */
		private Operation renvoieOp(String s) {
			for (Operation op : Operation.values())
				if (s.equals(op.getSymbol()))
					return op;
			return null;
		}




	
		
}
