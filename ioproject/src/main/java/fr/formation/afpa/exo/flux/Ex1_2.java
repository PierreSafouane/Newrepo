package fr.formation.afpa.exo.flux;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex1_2 {

	public static void main(String[] args) {

		String nom = "";
		String prenom;
		String annee;
		Scanner sc = new Scanner(System.in);

		try {
			OutputStream w = new FileOutputStream("tp/ex1_2.txt");
			DataOutputStream d = new DataOutputStream(w);

			while (nom != "0") {
				System.out.println("Donnez le nom ou ecrire 0 pour fin");
				nom = sc.nextLine();
				if (nom.contains("0")) {
					System.out.println("Fin programme");
					break;
				}
				d.writeUTF(nom);
				System.out.println("Donnez le prenom");
				prenom = sc.nextLine();
				d.writeUTF(prenom);
				System.out.println("Donnez l'année de naissance");
				annee = sc.nextLine();
				
				d.writeUTF(annee);
			}
			System.out.println("*** fin creation fichier ***");

			d.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
