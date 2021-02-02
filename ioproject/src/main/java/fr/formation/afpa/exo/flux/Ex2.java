package fr.formation.afpa.exo.flux;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Ex2 {

	public static void main(String[] args) {

		try {
			Reader r = new FileReader("tp/ex1.txt");
			char[] tmp = new char[20];
			int i = -1;

			while ((i = r.read(tmp)) != -1) {
				String s = new String(tmp, 0, i);
				System.out.println(s);
			}

			r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
