package pack;

public class Point {
	
	private char nom;
	private int absc;
	
	public Point() {
		
	}

	public Point(char nom) {
		this.nom=nom;
	}
	
	public Point(char nom, int absc) {
		this(nom);
		this.absc=absc;
	}
	
	public void affiche(char nom,int absc) {
		System.out.println(this.nom+" "+this.absc);
	}
	
	public void translate (int absc) {
		System.out.println("Votre abscisse est : "+this.absc);
		this.absc += absc;
		System.out.println("La translation de votre abscisse est : "+this.absc);
	}
	
}
