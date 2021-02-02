package tp_App1;

public class Chercheur {

	String nomch;
	String poste;
	int numPc;
	
	
	public Chercheur(String nomch, String poste, int numPc) {
		this.nomch = nomch;
		this.poste = poste;
		this.numPc = numPc;
	}
	
	public String toString() {
		return this.nomch+" "+this.poste+" "+this.numPc;
	}



}
