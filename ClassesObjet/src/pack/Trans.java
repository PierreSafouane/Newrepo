package pack;

public class Trans {

	public static void main(String[] args) {
		
		B b = new B(2);
		int n = 2;
		System.out.println("valeur de b avant : "+b.getn());
		Util.incre(b, 5);
		System.out.println("valeur de b apres : "+b.getn());
		System.out.println("valeur de n avant : "+n);
		Util.incre(n, 5);
		System.out.println("valeur de n apres : "+n);

	}

}
