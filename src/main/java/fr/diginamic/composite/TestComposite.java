package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		Service DSIN = new Service("DSIN");
		Service bigData = new Service("Big Data");
		Service javaDev = new Service("Java Dev");
		
		DSIN.addElement(new Employe("Cecile", "Raspey", 1000));
		DSIN.addElement(new Employe("Bilel", "Bechkar", 8000));
		
		javaDev.addElement(new Employe("Kevin", "Guineau", 7500));
		javaDev.addElement(new Employe("Paul", "Martin", 3500));
		
		bigData.addElement(new Employe("JB", "Ranmey", 7500));
		bigData.addElement(new Employe("Jane", "Doe", 3500));
		
		DSIN.addElement(javaDev);
		DSIN.addElement(bigData);
		
		System.out.println("bigData salaires: " + bigData.calculerSalaire());
		System.out.println("javaDev salaires: " + javaDev.calculerSalaire());
		System.out.println("DSIN salaires: " + DSIN.calculerSalaire());
	}

}
