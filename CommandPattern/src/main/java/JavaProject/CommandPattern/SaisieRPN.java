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

			String input = ""; 
			String s = "";

			while(m.ouvert()) {
				System.out.println("Pour effectuer vos calculs ,veuillez Saisir soi un entier ou une opération ou bien exit pour sortir,tapez entrer");
				try {
					input = scannerLigne();
					s += input + " ";
					System.out.println(s);
				}
				catch (Exception e) {
					System.err.println(e.getMessage());
				}
				System.out.println(m.affichagePile());
			}

			checkNombreOperations();

			System.out.println("Fin du programme");
			this.fermerScanner();    
		}
		
		public String scannerLigne() throws DivParZeroExcept, MaxExcept, 
		ArgPileExcept, ErreurSaisieExcept {
			String s;
			if (scan.hasNextDouble()) {
				Double d = scan.nextDouble();
				m.enregistrerNb(d);
				scan.nextLine();
				s = d.toString();
			} 
			else {
				s = scan.nextLine();
				if (s.equals("exit")) {
					m.shutdown();
				}
				else if (s.equals("undo")) {
					m.undo();
				}
				else if (isOp(s)) {
					m.appliquerOp(renvoieOp(s));	
				}
				else {
					throw new ErreurSaisieExcept();
				}
			}
			return s;
		}
		
		
		private boolean isOp(String str) {
			return this.renvoieOp(str) != null;
		}
		
		/**
		 * Retourne une opération
		 */
		private Operation renvoieOp(String s) {
			for (Operation op : Operation.values())
				if (s.equals(op.getSymbol()))
					return op;
			return null;
		}
		
		
		
		/**
		 * Vérifier la pile
		 */
		public void listeValide() throws NbOpExcept {
			if (!(this.m.getSizePile() == 1)) {throw new NbOpExcept();}
		}
		
		
		/**
		 * NombreOperationsException
		 */
		private void checkNombreOperations() {
			try {
				this.listeValide();
			}
			catch (Exception except) {
				System.err.println(except.getMessage());
			}
		}
		
}
