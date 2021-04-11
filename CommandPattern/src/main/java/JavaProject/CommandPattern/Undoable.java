package JavaProject.CommandPattern;

/**
 * @ADOUANE Cylia  @Ouiza HELLAL

 * On ajoute cette class pour  annuler Undo et Exit
 * Permet de respecte ISP (segregation des interfaces)
*/

public interface Undoable extends Command {
	
	public void undo();
	              
}
