package ex7;

 public class PointNom extends Point {
	
	private char nom;

	PointNom (int x, int y, char nom){
		super(x,y);
		this.nom=nom;
	}
	
	public static boolean identiques (PointNom a, PointNom b) {
		return ((Point.identiques(a, b))&&(a.nom==b.nom));
	}
	
	public boolean identique (PointNom a) {
		return (super.identique(a)&&(a.nom==nom));
	}
	
}
