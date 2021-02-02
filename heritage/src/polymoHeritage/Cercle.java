package polymoHeritage;

public class Cercle extends Point {
	
	private Point centre;
	private int rayon;
	
	public Cercle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon =rayon;
	}
	
	public void deplaceCentre(Point centre) {
		this.centre = centre;
	}
	
	public void changeRayon(int rayon) {
		this.rayon = rayon;
	}

	public String getCentre() {
		return "absc = "+centre.getX()+" ord = "+centre.getY();
	}

	public int getRayon() {
		return rayon;
	}
	
	public void affiche() {
		
		System.out.println("Centre : "+getCentre()+" || Rayon : "+getRayon());
		
	}
	

}
