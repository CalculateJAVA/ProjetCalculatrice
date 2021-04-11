package JavaProject.CommandPattern;
/**
 * @Cylia ADOUANE @ Ouiza HELLAL
 * Exception renvoyée si la valeur est trop grande
 */

public class MaxExcept extends ArithmeticException {
	
		/**
		 * Constructeur de l'exception
		 */
		public MaxExcept() {
			super("Impossible de gerer ce nombre ,il est trop grand");
		}
	}



