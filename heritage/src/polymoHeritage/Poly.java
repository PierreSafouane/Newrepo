package polymoHeritage;

public class Poly {

	public static void main(String[] args) {
		A2 a = new A2();
		a.affiche();
		System.out.println();

		B2 b = new B2();
		b.affiche();
		a = b;
		a.affiche();
		System.out.println();

		C c = new C();
		c.affiche();
		a = c;
		a.affiche();
		System.out.println();

		D d = new D();
		d.affiche();
		a = d;
		a.affiche();
		c = d;
		c.affiche();
		System.out.println();

		E e = new E();
		e.affiche();
		a = e;
		a.affiche();
		b = e;
		b.affiche();
		System.out.println();

		F f = new F();
		f.affiche();
		a = f;
		a.affiche();
		c = f;
		c.affiche();

	}

}
