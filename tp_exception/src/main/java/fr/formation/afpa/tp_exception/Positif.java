package fr.formation.afpa.tp_exception;

public class Positif {
	
	int n;
	
	public Positif(int n) throws ErrConst {
		
		if(n<0) {
			throw new ErrConst(n);
		}
		this.n = n;
	}
	
	public static Positif Somme (Positif a, Positif b) throws ErrSom {
		int n1 = a.n;
		int n2 = b.n;
		long s = n1-n2;
		System.out.println(s);
		if (s>2147483647) {
			throw new ErrSom(s);
		}
		return new Positif((int)s);
	}

	public int getN() {
		return n;
	}
	
	

}
