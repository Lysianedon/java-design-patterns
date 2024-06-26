package fr.diginamic.factory;

import fr.diginamic.factory.beans.Element;
import fr.diginamic.factory.beans.ElementType;
import fr.diginamic.factory.beans.Unite;
import fr.diginamic.factory.services.ElementFactory;

public class App {

	public static void main(String[] args) {
		Element ingredient = ElementFactory.createElement(ElementType.INGREDIENT, "Sucre", 100, Unite.MILLI_GRAMMES);
		Element additif = ElementFactory.createElement(ElementType.ADDITIF, "Colorant", 5, Unite.MICRO_GRAMMES);
		Element allergene = ElementFactory.createElement(ElementType.ALLERGENE, "Gluten", 200, Unite.MILLI_GRAMMES);

		System.out.println(ingredient);
		System.out.println(additif);
		System.out.println(allergene);
	}

}
