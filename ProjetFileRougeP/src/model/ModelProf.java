package model;


import metier.Professeur;

public class ModelProf {

	private Professeur professeur;

	public ModelProf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelProf(Professeur professeur) {
		super();
		this.professeur = professeur;
	}

	public Professeur getNotes() {
		return professeur;
	}

	public void setNotes(Professeur professeur) {
		this.professeur = professeur;
	}
	
	
	
	
	
}
