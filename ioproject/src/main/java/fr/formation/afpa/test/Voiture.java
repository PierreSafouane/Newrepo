package fr.formation.afpa.test;

import java.io.Serializable;

public class Voiture implements Serializable {

	String marque;
	String model;
	int date;

	public Voiture(String marque, String model, int date) {
		this.marque = marque;
		this.model = model;
		this.date = date;

	}

	public String getMarque() {
		return marque;
	}

	public String getModel() {
		return model;
	}

	public int getDate() {
		return date;
	}
	
	

}
