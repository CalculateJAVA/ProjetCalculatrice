package JavaProject.CommandPattern;

/**
 * @Cylia ADOUANE @ Ouiza HELLAL

 */

public class GestionExcept {

		private static final double MIN_VALUE = 1000000;
		private static final double MAX_VALUE = 1000000;
		
		public static void gestionMinMax(double nb) {
			if(nb > MAX_VALUE || nb < -MIN_VALUE) {
				throw new MaxExcept();
			}
		}
		
		public static void handleStackSize(int actualSize, int wantedSize) {
			if(actualSize < wantedSize) {
				throw new ArgPileExcept();
			}
		}

}


