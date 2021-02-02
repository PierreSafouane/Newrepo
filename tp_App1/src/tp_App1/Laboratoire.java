package tp_App1;

public class Laboratoire {
	
	String nomLabo;
	String spé;
	int nbBu;
	Adresse adrs;
	Bureau bureau;
	
	public Laboratoire(String nomLabo, String spé, int nbBu, Adresse adrs, Bureau bureau) {
		this.nomLabo = nomLabo;
		this.spé = spé;
		this.nbBu = nbBu;
		this.bureau = bureau;
		this.adrs = adrs;
	}

}
