package metier;

public class Professeur {
	String login;
	String mot_de_passe;
	String prenom;
	String nom;
	String date_de_naissance;
	String email;
	
	public Professeur(String login, String mot_de_passe,String prenom, String nom, String date_de_naissance, String email) {
		this.login=login;
		this.mot_de_passe=mot_de_passe;
		this.prenom=prenom;
		this.nom=nom;
		this.date_de_naissance=date_de_naissance;
		this.email=email;
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(String date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
