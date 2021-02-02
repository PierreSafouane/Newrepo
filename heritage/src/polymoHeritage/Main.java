package polymoHeritage;

public class Main {

	public static void main(String[] args) {
		
//		Point p = new Point();
//		
//		
//		PointA a = new PointA();
//		
//		a.initialise(5, 6);
//		
//		a.affiche();
		
//		PointNom pN = new PointNom(1,2,"a");
//		
//		pN.affCoordNom();
//		
		Point test = new Point();
		
		test.initialise(18, 43);
		
		Cercle c = new Cercle(test,5);
		
		c.affiche();

	}

}
