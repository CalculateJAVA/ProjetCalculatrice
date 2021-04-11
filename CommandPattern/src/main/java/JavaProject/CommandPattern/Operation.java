package JavaProject.CommandPattern;

/**
* @ Cylia ADOUANE  @ Ouiza HELLAL
 * gerer les 4 opérations de la calculatrice (+,-,*,/). 
 */

public enum Operation {
	
	ADDITION("+"){
		@Override
		public double evaluation(double a , double b) {
			return a + b;
		}
	},
	
	SOUSTRACTION("-"){
		@Override
		public double evaluation(double a , double b) {
			return a - b;
		}
	},

	MULTIPLICATION("*"){
		@Override
	    public double evaluation(double a, double b) {
			return a * b;
		}

	},

	DIVISION("/"){
		@Override
	    public double evaluation(double a , double b) {
			return a / b;
		}

	};


	private String symbol;
	
	/**
	* Initialisation de l'opération
	*/
	
	private Operation(String symbol) {
			this.symbol = symbol; 
	}

	/**
	* méthode d'évaluation abstraite 
	*/
	
	public abstract double evaluation (double a , double b);

	/**
	* récupération du symbol de l'opération et return Symbol
	*/
	
	public String getSymbol() {
		return symbol;
	}


}
