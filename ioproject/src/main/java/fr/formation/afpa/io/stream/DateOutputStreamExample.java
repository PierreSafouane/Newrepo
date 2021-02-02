package fr.formation.afpa.io.stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DateOutputStreamExample {

	public static void main(String[] args) {

		int zip = 59000;
		String nom = "Lille";
		long nbrHabitants = 2800000;
		float temperature = 2.5f;
		
		try {
		OutputStream w = new FileOutputStream("toto/data.txt");
		DataOutputStream dos = new DataOutputStream(w);
		
		dos.writeInt(zip);
		dos.writeUTF(nom);
		dos.writeLong(nbrHabitants);
		dos.writeFloat(temperature);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
