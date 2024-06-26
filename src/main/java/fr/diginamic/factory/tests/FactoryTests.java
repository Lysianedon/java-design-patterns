package fr.diginamic.factory.tests;

import fr.diginamic.factory.beans.Element;
import fr.diginamic.factory.beans.ElementType;
import fr.diginamic.factory.beans.Ingredient;
import fr.diginamic.factory.beans.Allergene;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.diginamic.factory.beans.Additif;
import fr.diginamic.factory.beans.Unite;
import fr.diginamic.factory.services.ElementFactory;

public class FactoryTests {

	@Test
	@DisplayName("Test de création d'Ingredient")
	void testCreateIngredient() {
		Element ingredient = ElementFactory.createElement(ElementType.INGREDIENT, "Sucre", 100, Unite.MILLI_GRAMMES);
		assertNotNull(ingredient);
		assertTrue(ingredient instanceof Ingredient);
		assertEquals("Sucre", ingredient.getNom());
		assertEquals(100, ingredient.getValeur(), 0.000001);
		assertEquals(Unite.MILLI_GRAMMES, ingredient.getUnite());
	}

	@Test
	@DisplayName("Test de création d'Additif")
	void testCreateAdditif() {
		Element additif = ElementFactory.createElement(ElementType.ADDITIF, "Colorant", 5, Unite.MICRO_GRAMMES);
		assertNotNull(additif);
		assertTrue(additif instanceof Additif);
		assertEquals("Colorant", additif.getNom());
		assertEquals(5, additif.getValeur(), 0.000001);
		assertEquals(Unite.MICRO_GRAMMES, additif.getUnite());
	}

	@Test
	@DisplayName("Test de création d'Allergene")
	void testCreateAllergene() {
		Element allergene = ElementFactory.createElement(ElementType.ALLERGENE, "Gluten", 200, Unite.MILLI_GRAMMES);
		assertNotNull(allergene);
		assertTrue(allergene instanceof Allergene);
		assertEquals("Gluten", allergene.getNom());
		assertEquals(200, allergene.getValeur(), 0.000001);
		assertEquals(Unite.MILLI_GRAMMES, allergene.getUnite());
	}

	@Test
	@DisplayName("Test de création avec type null")
	void testCreateUnknownType() {
	    // Test que la méthode renvoie null quand le type est null
	    Element result = ElementFactory.createElement(null, "Unknown", 0, Unite.MILLI_GRAMMES);
	    assertNull(result, "Le résultat devrait être null pour un type null.");
	}

}
