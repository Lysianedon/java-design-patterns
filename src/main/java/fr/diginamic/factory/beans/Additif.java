package fr.diginamic.factory.beans;

public class Additif extends Element{

	public Additif(String nom, double valeur, Unite unite) {
		super(nom, valeur, unite);
	}

	@Override
	public String toString() {
		return "Additif [nom=" + nom + ", valeur=" + valeur + ", unite=" + unite + "]";
	}

}
