package fr.formation.afpa.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {

		try {
			Reader r = new FileReader("rw/test_rw.txt");

			int i = -1;
			char[] tmp = new char[10];
			while ((i = r.read(tmp)) != -1) {
				String s = new String(tmp, 0, i);
				System.out.print(s);
//				System.out.print((char) i);
			}
			r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
