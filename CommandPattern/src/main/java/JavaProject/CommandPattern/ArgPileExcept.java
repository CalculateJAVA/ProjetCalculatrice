package JavaProject.CommandPattern;

/**
 * Exception pour la pile
 * @ Cylia ADOUANE @ Ouiza HELLAL
 */

public class ArgPileExcept extends IllegalArgumentException {
	/**
	* Constructeur
	*/
		public ArgPileExcept() {
			super("Pile vide ou pas assez d'operandes");
		}

	

}
