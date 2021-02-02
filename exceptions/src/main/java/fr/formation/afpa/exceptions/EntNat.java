package fr.formation.afpa.exceptions;

public class EntNat {

	int a;

	public EntNat(int a) throws TypeErrConst {

		if (a < 0) {
			throw new TypeErrConst();
		}
		this.a = a;
		System.out.println("☺ ☺ ☺ ☺ : "+getA());
	}

	public int getA() {
		return a;
	}

}
