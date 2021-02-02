package project_java0;

public class Projet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 15;
		int d = c;
		System.out.println(somme(c, d));
		boolean bool = true;
		bool = 15 > 5;
		System.out.println(bool);
		byte b = (byte) 210;
		System.out.println(b);
		for (char i = 65; i <= 90; i++) {
			System.out.print(" | " + i);
		}
		System.out.println(" ");
		byte B = (byte) (10 * 20);
		System.out.println(B);

		System.out.println();
	}

	public static int somme(int a, int b) {
		return a + b;
	}

}
