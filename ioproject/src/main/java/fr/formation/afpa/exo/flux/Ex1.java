package fr.formation.afpa.exo.flux;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		String nom = "";
		String prenom;
		String annee;
		char[] tabn = new char[20];
		char[] tabp = new char[20];
		Scanner sc = new Scanner(System.in);

		try {
			OutputStream w = new FileOutputStream("tp/ex1.txt");
			DataOutputStream d = new DataOutputStream(w);

			while (nom != "0") {
				System.out.println("Donnez le nom ou ecrire 0 pour fin");
				nom = sc.nextLine();
				if (nom.contains("0")) {
					System.out.println("Fin programme");
					break;
				}
				System.out.println("Donnez le prenom");
				prenom = sc.nextLine();
				System.out.println("Donnez l'année de naissance");
				annee = sc.nextLine();
				for (int i = 0; i < 20; i++) {
					tabn[i] = ' ';
					tabp[i] = ' ';
				}
				for (int i = 0; i < nom.length(); i++) {
					tabn[i] = nom.charAt(i);
					d.writeChar(tabn[i]);
				}
				for (int i = 0; i < prenom.length(); i++) {
					tabp[i] = prenom.charAt(i);
					d.writeChar(tabp[i]);
				}
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