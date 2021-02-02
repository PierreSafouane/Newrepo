package fr.formation.afpa.exo.flux;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex3_test {

	public static void main(String[] args) {

		char[] ligne = { '0', '0', '0', '0' };

		try {
			InputStream in = new FileInputStream("tp/ex3.txt");
			Reader reader = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(reader);

			String s = null;
			int i = 0;

			while ((s = br.readLine()) != null) {
				i++;
				String incr = "" + i;
				for (int j = ligne.length - 1; j >= ligne.length - incr.length(); j--) {
					for (int k = incr.length()-1; k >= 0; k--) {
						ligne[j] = incr.charAt(k);
					}
					
				}
				System.out.println(i + " : " + s);
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
