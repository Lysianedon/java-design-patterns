package fr.diginamic.factory.beans;

public class Allergene extends Element {

	public Allergene(String nom, double valeur, Unite unite) {
		super(nom, valeur, unite);
	}

	@Override
	public String toString() {
		return "Allergene [nom=" + nom + ", valeur=" + valeur + ", unite=" + unite + "]";
	}
}
