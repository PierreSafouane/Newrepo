package fr.formation.afpa.poo;

public class Stylo {

	private String couleurh;
	private int taille;
	private String couleurb;
	private String couleure;

	private Stylo(String couleurh, int taille, String couleurb, String couleure) {
		this.couleurh = couleurh;
		this.taille = taille;
		this.couleurb = couleurb;
		this.couleure = couleure;
	}

	private static Stylo tst;

	public static Stylo getStylo() {
		if (tst == null) {
			tst = new Stylo("blanc", 5, "bleu", "bleu");
			System.out.println("creation");
		} else {
			System.out.println("deja creer");
		}
		return tst;
	}

}
