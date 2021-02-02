package pack;

import java.util.Scanner;

public class Ex10 {
	
	
	private static int compt;
	private int c;
	private static int nb;
	
	public Ex10() {
		c=compt;
		
		compt++;
		nb++;
	}
	
	public static int debut(int cpt) {
		while(cpt<0) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Veuillez entre un nombre positif");
			cpt = sc.nextInt();
		}
		compt = cpt;
		return compt;
	}
	
	public String getIdent() {
		return "Objet num : "+c;
	}
	
	public static String getIdentMax() {
		return "Le num d'objet max est "+(compt-1);
	}
	
	public static String nbObjet() {
		return "Vous avez creer "+nb+" objets";
	}

}
