package fr.formation.afpa.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import fr.formation.afpa.test.Voiture;

import java.io.*;

public class ObjectOutputStreamExample {

	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("toto/obj.txt");

			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			oos.writeUTF("voiture de luxe");
			oos.writeObject(new Date());
			
			Voiture v1 = new Voiture("adrien", "theboss", 2020);
			Voiture v2 = new Voiture("alvin", "fluteur", 4);
			Voiture v3 = new Voiture("brendan", "cs", 2018);
			
			oos.writeObject(v1);
			oos.writeObject(v2);
			oos.writeObject(v3);
			
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
