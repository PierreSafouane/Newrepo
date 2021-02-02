package fr.formation.afpa.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileExmple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("nom de dossier a créer");

		String nameFile = sc.nextLine();

		// créer un fichier représentant un chemin
		File file = new File("C:\\Users\\afpa\\"+nameFile);

		// verifiez s'il existe
		System.out.println("Path exist ? " + file.exists());

		if (file.exists()) {

			getInfosFile(file);
			File[] children = file.listFiles();
			for(File f : children) {
				System.out.println(f.getAbsolutePath());
			}

		} else {

			file.mkdir();
			File[] roots = File.listRoots();
			for(File root : roots) {
				System.out.println(root.getAbsolutePath());
			}
			


			File fichier = new File(file + "/" + nameFile);

			if (!fichier.exists()) {
				try {
					fichier.createNewFile();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

			}
		}
	}

	private static void getInfosFile(File file) {
		System.out.println("Directory ? " + file.isDirectory());

		System.out.println("Simple Name : " + file.getName());

		long a = file.lastModified();

		Date modifyDate = new Date(a);

		System.out.println(modifyDate);
	}

}
