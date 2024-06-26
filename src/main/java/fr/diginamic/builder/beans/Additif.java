package fr.diginamic.builder.beans;

import java.util.HashSet;
import java.util.Set;

import fr.diginamic.builder.beans.Produit;

public class Additif {
	private String nom;
	private double qteMiligrammes;
	private Set<Produit> produits = new HashSet<>();
	
	
	public Additif(String nom, double qteMiligrammes) {
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
		return "Additif [nom=" + nom + ", qteMiligrammes=" + qteMiligrammes + "]";
	}

}
