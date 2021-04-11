package JavaProject.CommandPattern;
import java.util.Stack;


public class OpCommand implements Undoable{

		private double last;
		private double beforeLast;
		private Operation op;
		private Stack<Double> pile;
		
		public OpCommand(Stack<Double> pile, Operation op) {
			GestionExcept.handleStackSize(pile.size(), 2);
			this.pile = pile;
			this.op = op;
			
		}

		@Override
		public void apply() {
			double resultat;
			this.last = this.pile.pop();
			this.beforeLast = this.pile.pop();
			try {
				resultat = op.evaluation(beforeLast, last);
				GestionExcept.gestionMinMax(resultat);
				this.pile.push(resultat);
			}
			catch (ArithmeticException except) {
				this.pile.push(beforeLast);
				this.pile.push(last);
				throw except;
			}
			
		}
		
		@Override
		public void undo() {
			this.pile.pop();
			this.pile.push(beforeLast);
			this.pile.push(last);
		}

	}



