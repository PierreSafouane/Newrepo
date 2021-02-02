package fr.formation.afpa.exo.flux;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex2_2 {

	public static void main(String[] args) {

		InputStream is;

		boolean eof = false;

		try {
			is = new FileInputStream("tp/ex1_2.txt");
			DataInputStream d = new DataInputStream(is);

			while (!eof) {
				String nom = d.readUTF();
				String prenom = d.readUTF();
				String annee = d.readUTF();

				System.out.println("nom : " + nom);
				System.out.println("prenom : " + prenom);
				System.out.println("date de naissance : " + annee);
			}
			d.close();
		} catch (EOFException e) {
			eof = true;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
