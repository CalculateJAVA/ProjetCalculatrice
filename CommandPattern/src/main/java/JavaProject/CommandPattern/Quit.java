package JavaProject.CommandPattern;
/** 
 * @ Cylia ADOUANE @ Ouiza HELLAL
 **/

public class Quit implements Command {
	
		private Switch interrupteur;
		
		public Quit(Switch interrupteur) {
			this.interrupteur = interrupteur;
		}

		@Override
		public void apply() {
			interrupteur.fermer();
		}


}



