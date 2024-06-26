package fr.diginamic.factory.beans;

public enum Unite {
	MICRO_GRAMMES("microgrammes"), 
	MILLI_GRAMMES("milligrammes");
	
	private final String libelle;
	
	private Unite(String libelle) {
		this.libelle = libelle;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
}
