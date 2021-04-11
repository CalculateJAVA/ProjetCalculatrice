package JavaProject.CommandPattern;

/**
 * Exception pour la division par zéro
 * @ Cylia ADOUANE @ Ouiza HELLAL
 */

public class DivParZeroExcept extends ArithmeticException {
	
		/**
		 * Constructeur de l'exception
		 */
		public DivParZeroExcept() {
			super("Division par zéro");
		}

	}

