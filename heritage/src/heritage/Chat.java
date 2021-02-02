package heritage;

public class Chat extends Animal {

	private String couleur;

	public Chat(int age, String nom, String couleur) {
		super(age, nom);
		this.couleur = couleur;

	}

	@Override
	public void afficherNom() {
		System.out.println("Je suis un "+this.getClass().getSimpleName().toLowerCase()+ ", j'ai "+this.getAge()+" an(s)");
	}

}
