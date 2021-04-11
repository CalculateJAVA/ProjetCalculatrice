package JavaProject.CommandPattern;

/**
 *@Cylia ADOUANE @Ouiza HELLAL
 */


public class Switch {
	private boolean switchOk;
	
	
	public Switch() {
		this.switchOk = true;
	}
	
	
	public boolean ouvert() {
		return switchOk;
	}
	
	
	public void fermer() {
		switchOk = false;
	}	
	
		
	public void ouvrir() {
		switchOk = true;
	}	


}
