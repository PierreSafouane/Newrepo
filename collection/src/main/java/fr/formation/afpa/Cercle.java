package fr.formation.afpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Cercle implements Comparable<Cercle> {

	private int x, y;
	double rayon;

	public Cercle(int x, int y, double rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + ", " + y + " ; rayon : " + rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public int getX() {
		return x;
	}

	public int compareToY(Cercle o) {
		if (y == o.y) {
			return 0;
		} else if (y > o.y) {
			return 1;
		} else {
			return -1;
		}
	}

	public int compareToX(Cercle o) {
		if (x == o.x) {
			return compareToY(o);
		} else if (x > o.x) {
			return 1;
		} else {
			return -1;
		}
	}

	public int compareTo(Cercle o) {
		if (this.rayon == o.rayon) {
			return compareToX(o);
		} else if (rayon > o.rayon) {
			return 1;
		} else {
			return -1;
		}

	}

	public int compare(Cercle a, Cercle b) {
		return Double.compare(a.getRayon(), b.getRayon());
	}

	public static Comparator compare() {
		Comparator<Cercle> parRayon = Comparator.comparingDouble(Cercle::getRayon);
		return parRayon;
	}

	@Override
	public String toString() {
		return "Cercle [x=" + x + ", y=" + y + ", rayon=" + rayon + "]";
	}
	
	

}
