package fr.diginamic.factory.beans;

public class Ingredient extends Element{

	public Ingredient(String nom, double valeur, Unite unite) {
		super(nom, valeur, unite);
	}
	
	@Override
	public String toString() {
		return "Ingredient [nom=" + nom + ", valeur=" + valeur + ", unite=" + unite + "]";
	}
}
