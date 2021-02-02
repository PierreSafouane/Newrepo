package fr.formation.afpa.exceptions;

public class Main {

	public static void main(String[] args) throws TypeErrConst {
		
		
		try {
		EntNat a = new EntNat(2);
		EntNat b = new EntNat(-5);
		}
		catch(TypeErrConst e) {
			System.err.println("ici le catch");
		}

	}

}
