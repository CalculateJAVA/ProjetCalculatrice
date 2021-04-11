package JavaProject.CommandPattern;

/**
 * Exception pour le cas où il manque des opérations, on ne peut donc pas utiliser entièrement la pile
 * @ Cylia ADOUANE @ Ouiza HELLAL 
 */

public class NbOpExcept extends IllegalArgumentException {

		/**
		 * Constructeur de l'exception
		 */
		public NbOpExcept() {
			super("Erreur, pas assez d'opérations");
		}

	

}
