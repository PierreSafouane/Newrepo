package polymoHeritage;

public class PointNom extends Point2 {

	String nom = "";

	public PointNom(int x, int y, String nom) {
		super(x, y);
		this.nom = nom;
	}
	
	public void affCoordNom() {
		affCoord();
		System.out.println(nom);
	}

}
