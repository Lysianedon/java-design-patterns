package fr.diginamic.strategy;

public class Tri {

	public void exec(int typeTri, Integer[] arr) {
		
		// Bubble sort algorithm
		Strategy strategy = StrategyFactory.getStrategy(typeTri);
		strategy.trier(arr);
	}
}
