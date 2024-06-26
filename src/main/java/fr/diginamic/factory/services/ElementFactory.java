package fr.diginamic.factory.services;

import fr.diginamic.factory.beans.Element;
import fr.diginamic.factory.beans.Ingredient;
import fr.diginamic.factory.beans.Allergene;
import fr.diginamic.factory.beans.Additif;
import fr.diginamic.factory.beans.Unite;
import fr.diginamic.factory.beans.ElementType;

public class ElementFactory {

	public static Element createElement(ElementType type, String nom, double valeur, Unite unite) {
		
		if(type == null) return null;
		
        switch (type) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            default:
                return null;
        }
    }

}
