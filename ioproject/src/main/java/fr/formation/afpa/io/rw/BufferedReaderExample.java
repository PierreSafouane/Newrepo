package fr.formation.afpa.io.rw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		try {
			InputStream in = new FileInputStream("rw/multi_line.txt");
			Reader reader = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(reader);
			
			String s = null;
			int i = 0;
			
			while ((s=br.readLine()) != null) {
				i++;
				System.out.println(i+" : "+s);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
