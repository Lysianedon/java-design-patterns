package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {
	private static ResourceBundle bundle = ResourceBundle.getBundle("config");

	private String url;
	private String user;
	private String password;

	/** Constructeur privé */
	private Singleton() {
		url = bundle.getString("db.url");
		user = bundle.getString("db.user");
		password = bundle.getString("db.password");
	}

//	/** Holder */
	private static class SingletonHolder {
		/** Instance unique non préinitialisée */
		private final static Singleton INSTANCE = new Singleton();
	}

	/** Point d'accès pour l'instance unique du singleton */
	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
}