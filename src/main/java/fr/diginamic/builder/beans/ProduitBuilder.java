package fr.diginamic.builder.beans;

import java.util.HashSet;
import java.util.Set;

public class ProduitBuilder {

	Produit produit;
	private String nom;
	private String grade;
	private Categorie categorie;
	private Marque marque;
	private Set<Ingredient> ingredients = new HashSet<>();
	private Set<Allergene> allergenes = new HashSet<>();
	private Set<Additif> additifs = new HashSet<>();

	public ProduitBuilder(String nom) {
		produit = new Produit(nom);
	}

	public ProduitBuilder(String nom, String grade) {
		produit = new Produit(nom, grade);
	}

	public ProduitBuilder nom(String nom) {
		this.nom = nom;
		return this;
	}

	public ProduitBuilder grade(String grade) {
		this.grade = grade;
		return this;
	}

	public ProduitBuilder categorie(String nom) {
		this.categorie = new Categorie(nom);
		return this;
	}

	public ProduitBuilder marque(String nom) {
		this.marque = new Marque(nom);
		return this;
	}

	public ProduitBuilder addIngredient(String nom, double qteMiligrammes) {
		this.ingredients.add(new Ingredient(nom, qteMiligrammes));
		return this;
	}

	public ProduitBuilder addAllergene(String nom, double qteMiligrammes) {
		this.allergenes.add(new Allergene(nom, qteMiligrammes));
		return this;
	}

	public ProduitBuilder addAdditif(String nom, double qteMiligrammes) {
		this.additifs.add(new Additif(nom, qteMiligrammes));
		return this;
	}

	public Produit build() {

		Produit produit = new Produit(nom, grade);
		produit.setCategorie(categorie);
		produit.setMarque(marque);
		produit.setIngredients(ingredients);
		produit.setAdditifs(additifs);
		produit.setAllergenes(allergenes);

		if (produit.getNom() == null || produit.getNom().trim().isEmpty() || produit.getNom().trim().equals("")) {
			throw new IllegalStateException("Le nom du produit ne peut pas être vide.");
		}
		if (produit.getCategorie() == null) {
			throw new IllegalStateException("La catégorie du produit ne peut pas être nulle.");
		}
		if (produit.getMarque() == null) {
			throw new IllegalStateException("La marque du produit ne peut pas être nulle.");
		}

		if (produit.getIngredients().isEmpty()) {
			throw new IllegalStateException("Le produit doit contenir au moins un ingrédient.");
		}

		return produit;
	}

}
