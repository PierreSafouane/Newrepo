package fr.formation.afpa.io.stream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamExample {

	public static void main(String[] args) {
		
		InputStream is;
		
		try {
			is = new FileInputStream("toto/data.txt");
			DataInputStream dis = new DataInputStream(is);
			
			int zip = dis.readInt();
			String nom = dis.readUTF();
			long nbr = dis.readLong();
			float tmp = dis.readFloat();

			System.out.println("Ville : "+nom);
			System.out.println("Cp : "+zip);
			System.out.println("Habitants : "+nbr);
			System.out.println("Temperature : "+tmp+" °c");
			
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
