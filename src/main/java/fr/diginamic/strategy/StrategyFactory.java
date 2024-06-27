package fr.diginamic.strategy;

public class StrategyFactory {
	
	
	public static Strategy getStrategy(int n) {
		Tritype type = Tritype.valueOf(n);
		switch(type) {
		case BUBBLE:
			return new Bubble();
		case INSERTION:
			return new Insertion();
		case SELECTION:
			return new Selection();
			default:
				throw new IllegalArgumentException("Unknown Strategy");
			
		}
	}

}
