package JavaProject.CommandPattern;
/**
 * Exception dans pour d'une erreur de saisie
 * @ Cylia ADOUANE @ Ouiza HELLAL 
 */

public class ErreurSaisieExcept extends IllegalArgumentException {

		/**
		 * Constructeur
		 */
		public ErreurSaisieExcept() {
			super("Saisie erronée");
		}

}
