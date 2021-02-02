package fr.formation.afpa.exo;


public class Chemin1 {

	public static void main(String[] args) {

		try {
			A a = new A(1);
			System.out.println("apres creation a(1)");
		} catch (Erreur e) {
			System.out.println("**exception Erreur "+e.num);
		}
		System.out.println("suite main");
		try {
			A b = new A(1);
			System.out.println("apres creation b(1)");
		} catch (Erreur_d e) {
			System.out.println("** exception Erreu_d"+e.num+" "+e.code);
		}
		catch (Erreur e) {
			System.out.println("** exception Erreur "+e.num);
		}
	}

}
