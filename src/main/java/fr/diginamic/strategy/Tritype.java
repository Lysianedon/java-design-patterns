package fr.diginamic.strategy;

public enum Tritype {
	BUBBLE(1), INSERTION(2), SELECTION(3);

	private final int value;

	Tritype(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static Tritype valueOf(int value) {
		for(Tritype type: values()) {
			if(type.value == value) return type;
		}
		return null;
	}
	

}
