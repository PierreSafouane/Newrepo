package fr.formation.afpa.io.rw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	
	public static void main(String[] args) {
		
		File file = new File("rw");
		
		file.mkdirs();
		
		try {
			Writer w = new FileWriter("rw/test_rw.txt");
			
			char[] chars = "Bonjour cda 2021".toCharArray();
			
//			for (int i = 0; i < chars.length; i++) {
//				char ch = chars[i];
//				int j = (int) ch;
//				w.write(j);
//			}
			w.write(chars);
			w.close();
			System.out.println("fin programme!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
