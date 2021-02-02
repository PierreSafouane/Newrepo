package pack;

public class Point2 {
	
	int x;
	int y;
	
	public Point2(int absc, int ord) {
		x=absc;
		y=ord;
	}
	
	public String affabsc () {
		return "l'abscisse est : "+x;
	}
	
	public String afford() {
		return "l'ordonnée est : "+y;
	}

	public static void main(String[] args) {
		
		Point2 p = new Point2(3,2);
		
		System.out.println(p.affabsc());
		System.out.println(p.afford());
		
	
		
		

	}

}
