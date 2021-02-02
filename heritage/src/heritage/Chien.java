package heritage;

public class Chien extends Animal {

	private String couleur;

	public Chien(int age, String nom, String couleur) {
		super(age, nom);
		this.couleur = couleur;

	}

	@Override
	public void afficherNom() {
		System.out.println("Je suis un "+this.getClass().getSimpleName().toLowerCase()+", ma couleur est : "+this.couleur+", mon nom est : "+this.getNom());
	}

}
