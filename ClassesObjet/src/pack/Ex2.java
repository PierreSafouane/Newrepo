package pack;

public class Ex2 {

	
	public Ex2 (int coeff) {
		nbre *=coeff;
		nbre += decal;
	}
	
	public void affiche () {
		System.out.println("nbre = "+nbre+" decal = "+decal);
	}
	private int nbre = 20;
	private int decal;
	
public static void main(String[] args) {
		
		Ex2 a = new Ex2 (5); a.affiche();

	}

}
