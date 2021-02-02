package heritage;

public abstract class Animal {
	
	private int age;
	private String nom;
	
	public Animal() {
		
	}

	public Animal(int age, String nom) {
		this.age=age;
		this.nom=nom;
		
	}
	
	public abstract void afficherNom();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
