package fr.diginamic.builder.beans;

import java.util.HashSet;
import java.util.Set;

public class Allergene {
	private String nom;
	private double qteMiligrammes;
	private Set<Produit> produits = new HashSet<>();
	
	public Allergene(String nom, double qteMiligrammes) {
		this.nom = nom;
		this.qteMiligrammes = qteMiligrammes;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getQteMiligrammes() {
		return qteMiligrammes;
	}
	public void setQteMiligrammes(double qteMiligrammes) {
		this.qteMiligrammes = qteMiligrammes;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Allergene [nom=" + nom + ", qteMiligrammes=" + qteMiligrammes + ", produits=" + produits + "]";
	}
	
	

}
