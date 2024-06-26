package fr.diginamic.builder.beans;

import java.util.HashSet;
import java.util.Set;

public class Marque {
	String nom;
	private Set<Produit> produits = new HashSet<>();

	public Marque(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	
	@Override
	public String toString() {
		return "Marque [nom=" + nom + ", produits=" + produits + "]";
	}	
}
