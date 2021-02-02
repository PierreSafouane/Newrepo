package fr.formation.afpa.Tp;

import java.util.Scanner;

public class Main {
	
	public static void affichage() {
		
	}

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Que souhaitez vous faire ?");
		System.out.println("1-Stocker les notes des élèves dans un tableau.");
		System.out.println("2-Afficher la liste des notes.");
		System.out.println("3-Modifier une note");
		System.out.println("4-Afficher la moyenne de la classe.");
		System.out.println("5-Afficher la note la plus élevée.");
		System.out.println("6-Afficher la note la plus base.");
		System.out.println("0-Quitter le programme.");

		int choice = sc.nextInt();

		while (choice < 0 || choice > 6) {
			System.err.println("Erreur commande non reconnue !");
			System.out.println("1-Stocker les notes des élèves dans un tableau.");
			System.out.println("2-Afficher la liste des notes.");
			System.out.println("3-Modifier une note");
			System.out.println("4-Afficher la moyenne de la classe.");
			System.out.println("5-Afficher la note la plus élevée.");
			System.out.println("6-Afficher la note la plus base.");
			System.out.println("0-Quitter le programme.");
			choice = sc.nextInt();
		}

		switch (choice) {
		
		case 0:
			System.out.println("Programme terminé");
			break;
			
		case 1:
			
			break;

		case 2:

			break;

		case 3:

			break;

		case 4:

			break;

		case 5:

			break;

		case 6:

			break;

		}

	}

}
