package fr.formation.afpa.Tp;

public class Eleves {
	
	private String nom;
	private String prenom;
	private int id;
	
	public Eleves(String nom, String prenom, int id) {
		
		this.nom=nom;
		this.prenom=prenom;
		this.id=id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Eleves nom : " + nom + ", prenom : " + prenom + ", id : " + id;
	}
	
	

}
