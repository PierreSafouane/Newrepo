package project_java0;

import java.util.Arrays;
import java.util.Scanner;

public class UtilTab {

	public static void somme(double a, double b) {
		double somme = a + b;
		System.out.println(somme);
	}

	public static void incre(double tab[], double increment) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] += increment;
			System.out.println(tab[i]);
		}
	}

	public static double[] genere(int n) {
		double tab[] = new double[n];
		int j = 1;
		for (int i = 0; i < n; i++, j += 2) {
			tab[i] = j;
		}
		return tab;
	}

	public static void aff(double[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	public static double[] sum(double tab1[], double tab2[]) {
		double tab3[] = new double[tab1.length];

		for (int i = 0; i < tab1.length; i++) {
			tab3[i] = tab1[i] + tab2[i];
		}
		return tab3;
	}

	public static void add(double... a) { // méthode qui permet d'additionner un nb illimité de nombres
		double sum = 0;
		for (double i : a)
			sum += i;
		System.out.println(sum);
	}

	public static <T> void generique(T attribut) { // méthode qui permet d'additionner un nb illimité de nombres

		System.out.print(attribut);

	}

	public static void affiche(double t[][]) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + " -- ");
			}
			System.out.println();
		}
	}

	public static boolean regulier(double tab[][]) {
		boolean b = true;
		for (int i = 1; i < tab.length; i++) {
			if (tab[i].length != tab[0].length) {
				b = false;
				break;
			}
		}

		return b;
	}

	public static double[] sommeLigne(double mat[][]) {
		double tab[] = new double[mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				tab[i] += mat[i][j];
			}
		}
		return tab;
	}

	public static boolean dim(double mat1[][], double mat2[][]) {
		boolean b = true;
		if (regulier(mat1) == false || regulier(mat2) == false) {
			b = false;
		} else if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
			b = false;
		}
		return b;

	}

	public static double[][] somme2(double mat1[][], double mat2[][]) {
		double mat3[][] = new double[mat1.length][mat1[0].length];
		if (dim(mat1, mat2) == true) {
			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat1[i].length; j++) {
					mat3[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
		} else {
			mat3 = null;
		}
		if (mat3 != null) {
			affiche(mat3);
		} else {
			System.out.println(mat3);
		}
		return mat3;
	}

	public static void usd() {
		Scanner sc = new Scanner(System.in);
		String tab[] = new String[6];
		System.out.println("veuillez entrer 6 lettres");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = sc.nextLine();
		}
		for (int i = 0; i < tab.length; i += 2) {
			System.out.println(tab[i]);
		}
	}

	public static void fl() {
		Scanner sc = new Scanner(System.in);
		String tab[] = new String[6];
		System.out.println("veuillez entrer 6 lettres");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = sc.nextLine();
		}
		System.out.println(tab[0] + " " + tab[tab.length - 1]);
	}

	public static void verti(int n) {

		if (n < 10) {
			System.out.println(n);
		} else {
			verti(n / 10);
			System.out.println(n % 10);
		}

	}

	public static void compteurL() {
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int y = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot");
		String mot = sc.nextLine().toLowerCase();
		char[] tab = new char[mot.length()];

		for (int k = 0; k < mot.length(); k++) {
			tab[k] = mot.charAt(k);
			if (tab[k] == ('a')) {
				a++;
			}
			if (tab[k] == ('e')) {
				e++;
			}
			if (tab[k] == ('i')) {
				i++;
			}
			if (tab[k] == ('o')) {
				o++;
			}
			if (tab[k] == ('u')) {
				u++;
			}
			if (tab[k] == ('y')) {
				y++;
			}
		}
		System.out.println(a + " fois la lettre a");
		System.out.println(e + " fois la lettre e");
		System.out.println(i + " fois la lettre i");
		System.out.println(o + " fois la lettre o");
		System.out.println(u + " fois la lettre u");
		System.out.println(y + " fois la lettre y");
	}

	public static void verbe() {
		boolean b = false;
		while (b == false) {
			b=true;
			Scanner sc = new Scanner(System.in);
			System.out.println("donnez un verbe regulier du premier groupe.");
			String mot = sc.nextLine().toLowerCase();
			String verbe = "";
			char[] tab = new char[mot.length()];

			if (!mot.endsWith("er")) {
				b = false;
				System.out.println("*** il ne se termine pas par er - donnez-en un autre.");
			} else {

				for (int i = 0; i < tab.length - 2; i++) {
					tab[i] = mot.charAt(i);
					verbe += tab[i];
				}
				System.out.println("Je " + verbe + "e");
				System.out.println("tu " + verbe + "es");
				System.out.println("il/elle " + verbe + "e");
				System.out.println("nous " + verbe + "ons");
				System.out.println("vous " + verbe + "ez");
				System.out.println("ils/elles " + verbe + "ent");

			}
		}
	}

	public static void alpha() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de mots ?");
		String tab[] = new String[sc.nextInt() + 1];
		System.out.println("Donnez vos mots.");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = sc.nextLine().toLowerCase();
		}
		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[i].compareTo(tab[j]) > 0) {
					String temp = tab[j];
					tab[j] = tab[i];
					tab[i] = temp;
				}
			}
		}
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		System.out.println("fin");
	}

	public static void compteurLettre() {
		int a = 0; int e = 0; int i = 0; int o = 0; int u = 0; int y = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot");
		String mot = sc.nextLine().toLowerCase();

		for (int k = 0; k < mot.length(); k++) {
			switch (mot.charAt(k)) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			case 'y':
				y++;
				break;
			default:
				break;
			}
		}
		System.out.println(a + " fois la lettre a");
		System.out.println(e + " fois la lettre e");
		System.out.println(i + " fois la lettre i");
		System.out.println(o + " fois la lettre o");
		System.out.println(u + " fois la lettre u");
		System.out.println(y + " fois la lettre y");
	}

	public static void alvin () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de mots ?");
		String tab[] = new String[sc.nextInt()];
		sc.nextLine();
		System.out.println("Donnez vos mots.");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = sc.nextLine().toLowerCase();
		}
		Arrays.sort(tab);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
	public static void verbe2() {
		boolean b = false;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Donnez un verbe regulier du premier groupe.");
			String mot = sc.nextLine().toLowerCase();
			String verbe = "";
			char[] tab = new char[mot.length()];
			while (b == false) {
			if (!mot.endsWith("er")) {
				System.out.println("*** Il ne se termine pas par er - donnez-en un autre.");
				mot = sc.nextLine().toLowerCase();
			} else {
				b = true;

				for (int i = 0; i < tab.length - 2; i++) {
					tab[i] = mot.charAt(i);
					verbe += tab[i];
				}
				System.out.println("Je " + verbe + "e");
				System.out.println("tu " + verbe + "es");
				System.out.println("il/elle " + verbe + "e");
				System.out.println("nous " + verbe + "ons");
				System.out.println("vous " + verbe + "ez");
				System.out.println("ils/elles " + verbe + "ent");

			}
		}
	}
	
}
