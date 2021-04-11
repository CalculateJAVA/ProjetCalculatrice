package JavaProject.CommandPattern;
import java.util.Stack;


public class OpCommand implements Undoable{

		private double last;
		private double beforeLast;
		private Operation op;
		private Stack<Double> pile;
		
		public OpCommand(Stack<Double> pile, Operation op) {
			this.pile = pile;
			this.op = op;
		}

		@Override
		public void apply() {
			double resultat;
			this.last = this.pile.pop();
			this.beforeLast = this.pile.pop();
			
		}
		
		

	}



