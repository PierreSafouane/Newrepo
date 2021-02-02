package tp_App1;

public class Adresse {
	
	String departement;
	String ville;
	int zip;
	
	
	public Adresse (String departement, String ville, int zip) {
		this.departement = departement;
		this.ville = ville;
		this.zip = zip;
	}


	public String toString () {
		return this.departement+" "+this.ville+" "+zip;
	}
	
	

}
