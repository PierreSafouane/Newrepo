package tp_App1;

public class Bureau {

	int code;
	String nomBu;
	int cpMax;
	Chercheur[] ch;
	int nbPlaces;

	public Bureau(int code, String nomBu) {

		this.code = code;
		this.nomBu = nomBu;
		this.cpMax = 5;
	}

	public void ajout(Chercheur c) {
		if (ch == null) {
			ch = new Chercheur[cpMax];
			ch[0] = c;
			nbPlaces++;
		} else {
			if (nbPlaces == cpMax) {
				System.out.println("bureau déjà plein");
				return;
			}
			for (int i = 1; i < cpMax; i++) {
				if (ch[i] == null) {
					ch[i] = c;
					nbPlaces++;
					break;
				}
			}
		}

	}


	public String affChercheur() {
		String aff = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != null) {
				aff += ch[i] + " || ";
			}

		}
		return aff;
	}

	public String toString() {
		if (this.ch == null) {
			return "Code bureau : " + code + ". Nom bureau : " + nomBu + ". Chercheur(s) : Aucun chercheur.";
		} else {
			return "Code bureau : " + code + ". Nom bureau : " + nomBu + ". Chercheur(s) : " + affChercheur();
		}
	}

}
