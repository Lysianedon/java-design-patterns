package fr.diginamic.factory.beans;

public abstract class Element {
	String nom;
	double valeur;
	Unite unite;
	
	public Element(String nom, double valeur, Unite unite) {
		this.nom = nom;
		this.valeur = valeur;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}

	public double getValeur() {
		return valeur;
	}

	public Unite getUnite() {
		return unite;
	}



}
