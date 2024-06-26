package fr.diginamic.builder.beans;

import java.util.HashSet;
import java.util.Set;

public class Categorie {
	String nom;
	private Set<Produit> produits = new HashSet<>();

	public Categorie(String nom) {
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
		return "Categorie [nom=" + nom + ", produits=" + produits + "]";
	}
	
}
