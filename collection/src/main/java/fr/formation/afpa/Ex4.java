package fr.formation.afpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex4 {

	public static void main(String[] args) {

		Cercle a = new Cercle(1, 2, 3);
		Cercle b = new Cercle(4, 5, 6);
		Cercle c = new Cercle(6, 5, 4);
		Cercle d = new Cercle(3, 2, 4);

		ArrayList<Cercle> tab = new ArrayList<Cercle>();

		tab.add(a);
		tab.add(b);
		tab.add(c);
		tab.add(d);

		Iterator<Cercle> it = tab.iterator();
		while (it.hasNext()) {
			if (it.next() == null) {
				it.remove();
			}

		}

		for (Cercle o : tab) {
			System.out.print(o);
		}

		System.out.println();

		Collections.sort(tab);

		for (Cercle o : tab) {
			System.out.print(o);
		}

	}

}
