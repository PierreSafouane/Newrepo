package heritage;

public class Souris extends Animal {

	private String couleur;

	public Souris(int age, String nom, String couleur) {
		super(age, nom);
		this.couleur = couleur;

	}

	@Override
	public void afficherNom() {
		System.out.println("Je suis une "+this.getClass().getSimpleName().toLowerCase()+", mon nom est : "+this.getNom());
	}

}
