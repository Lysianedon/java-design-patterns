package fr.diginamic.builder.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.diginamic.builder.beans.Produit;
import fr.diginamic.builder.beans.ProduitBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class ProduitBuilderTest {
	private ProduitBuilder builder;

	@BeforeEach
	void setUp() {
		builder = new ProduitBuilder(" ");
	}

	@Test
	@DisplayName("Test de création de Produit valide")
	void testCreateValidProduit() {
		assertDoesNotThrow(() -> {
			ProduitBuilder builder = new ProduitBuilder("Chocolat");
			
			try {
				Produit produit = builder.grade("A").categorie("Sweets").marque("ChocoDeluxe")
				.addIngredient("Cacao", 59.0).addAdditif("E322", 1.0).addAdditif("gomme guar", 6.9)
				.addAllergene("Lait", 56.0).build();
				assertNotNull(produit);
				assertEquals("Chocolat", produit.getNom());
				assertEquals("A", produit.getGrade());
				assertNotNull(produit.getCategorie());
				assertNotNull(produit.getMarque());
				assertFalse(produit.getIngredients().isEmpty());
				assertFalse(produit.getAdditifs().isEmpty());
				assertFalse(produit.getAllergenes().isEmpty());
				
			} catch(Exception e) {
				fail(e);
			}
		});
	}

	@Test
	@DisplayName("Test de création de Produit avec nom null")
	void testCreateProduitWithNullName() {
		Exception exception = assertThrows(IllegalStateException.class, () -> {
			builder.nom(null).grade("A").categorie("Sweets").marque("ChocoDeluxe").build();
		});
		assertEquals("Le nom du produit ne peut pas être vide.", exception.getMessage());
	}

	@Test
	@DisplayName("Test de création de Produit sans catégorie")
	void testCreateProduitWithoutCategorie() {
		Exception exception = assertThrows(IllegalStateException.class, () -> {
			builder.nom("Chocolat").grade("A").marque("ChocoDeluxe").build();
		});
		assertEquals("La catégorie du produit ne peut pas être nulle.", exception.getMessage());
	}

	// Ajoutez d'autres tests pour couvrir les cas alternatifs pour `marque`,
	// `ingrédients`, etc.
}
