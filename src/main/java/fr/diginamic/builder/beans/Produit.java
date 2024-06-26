package fr.diginamic.builder.beans;

import java.util.HashSet;
import java.util.Set;

import fr.diginamic.builder.beans.Ingredient;

public class Produit {
	private String nom;
	private String grade;
	private Set<Ingredient> ingredients = new HashSet<>();
	private Set<Allergene> allergenes = new HashSet<>();
	private Set<Additif> additifs = new HashSet<>();

	private Categorie categorie;
	private Marque marque;

	public Produit(String nom) {
		this.nom = nom;
	}
	
	public Produit(String nom, String grade) {
		this.nom = nom;
		this.grade = grade;
	}

	public String getNom() {
		return nom;
	}

	void setNom(String nom) {
		this.nom = nom;
	}

	public String getGrade() {
		return grade;
	}

	void setGrade(String grade) {
		this.grade = grade;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Set<Allergene> getAllergenes() {
		return allergenes;
	}

	void setAllergenes(Set<Allergene> allergenes) {
		this.allergenes = allergenes;
	}

	public Set<Additif> getAdditifs() {
		return additifs;
	}

	public void setAdditifs(Set<Additif> additifs) {
		this.additifs = additifs;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Marque getMarque() {
		return marque;
	}

	void setMarque(Marque marque) {
		this.marque = marque;
	}

}
