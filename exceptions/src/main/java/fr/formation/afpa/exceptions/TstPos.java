package fr.formation.afpa.exceptions;

import java.util.Scanner;

public class TstPos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("debut main");
		boolean ok = false;
		
		while(!ok) {
			try {
				System.out.println("donnez un entier positif : ");
				int n = sc.nextInt();
				Positif ep = new Positif (n);
				ok = true;
			} catch (Exception e) {
				System.out.println("*** erreur construction ***");
			}
		}
		System.out.println("fin main");
	}

}
