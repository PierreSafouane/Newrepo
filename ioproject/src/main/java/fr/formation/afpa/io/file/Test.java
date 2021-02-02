package fr.formation.afpa.io.file;

import java.io.File;
import java.util.Scanner;

public class Test {

//	C:\Program Files\Google

	public static void main(String[] args) {

		FileExample f = new FileExample();

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez le pathName du repertoire:");
		String pathName = sc.nextLine();
		// créer un fichier représente un chemin
		File file = new File(pathName);

		// verifiez s'il existe
		System.out.println("Path exist ? " + file.exists());

		if (file.exists()) {
			f.suivant(pathName);
		} else {
			System.out.println("pathname inexistant");
		}

	}

}
