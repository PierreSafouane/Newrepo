package fr.formation.afpa.io.stream;

import java.io.FileInputStream;
import java.io.InputStream;


public class InputStreamExample {

	public static void main(String[] args) {
		
		InputStream is;
		try {
			
			is = new FileInputStream("toto/toto.txt");
			byte[] tmp = new byte[10];
			int i = -1;
			
//			while((i= is.read())!=-1) {
//				System.out.print(i+" : "+(char)i+"\n");
//			}
			
			while((i= is.read(tmp))!=-1) {
				String s = new String (tmp,0,i);
				System.out.println(s);
			}
			
			is.close();
		} catch (Exception e) {
			
		}


	}

}
