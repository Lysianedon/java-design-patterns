package fr.diginamic.composite;

import java.util.HashSet;
import java.util.Set;

public class Service implements IElement {

	String nom;
	Set<IElement> composites = new HashSet<>();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Service(String nom) {
		this.nom = nom;
	}

	@Override
	public double calculerSalaire() {
		double totalSalaires = 0;
		for (IElement e : composites) {
			totalSalaires += e.calculerSalaire();
		}
		return totalSalaires;
	}

	public void addElement(IElement e) {
		composites.add(e);
		
	}

}
