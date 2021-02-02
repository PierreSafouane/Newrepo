package fr.formation.afpa;

import java.util.Comparator;

public class CompareCercle implements Comparator<Cercle> {

	@Override
	public int compare (Cercle a, Cercle b) {
		return Double.compare(a.getRayon(), b.getRayon());
	}

}
