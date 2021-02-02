package ex7;

public class LimPoly {
	
	public static void main(String[] args) {
		
		Point p = new Point(2,4);
		PointNom pn1 = new PointNom(2,4,'A');
		PointNom pn2 = new PointNom(2,4,'B');
		System.out.println(pn1.identique(pn2));
		System.out.println(p.identique(pn1));
		System.out.println(pn1.identique(p));
		System.out.println(Point.identiques(pn1, pn2));
		
	}

}
