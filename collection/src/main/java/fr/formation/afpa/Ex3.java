package fr.formation.afpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		

		Cercle a = new Cercle(1, 2, 3);
		Cercle b = new Cercle(4, 5, 6);
		Cercle c = new Cercle(6, 5, 4);
		Cercle d = new Cercle(3, 2, 1);

		ArrayList<Cercle> tab = new ArrayList<Cercle>();

		tab.add(a);
		tab.add(b);
		tab.add(c);
		tab.add(d);
		tab.add(null);

		Iterator<Cercle> it = tab.iterator();
		while (it.hasNext()) {
			if (it.next() == null) {
				it.remove();
			}
			
		}
		
		
		Iterator<Cercle> itera = tab.iterator();
		while (itera.hasNext()) {
			if(itera.hasNext()) {
				System.out.print(itera.next().getRayon() + " || ");
			}
		}
		

//		System.out.println();
//
//		for (int i = tab.size() - 1; i >= 1; i--) {
//			for (int j = 0; j < tab.size() - 1; j++) {
//
//				if (tab.get(j).getRayon() > tab.get(j + 1).getRayon()) {
//
//					Cercle temp = tab.get(j + 1);
//					tab.set(j + 1, tab.get(j));
//					tab.set(j, temp);
//
//				}
//			}
//		}
		
		System.out.println();
		
		Collections.sort(tab, new CompareCercle());

		Iterator<Cercle> ite = tab.iterator();
		while (ite.hasNext()) {

			System.out.print(ite.next().getRayon() + " || ");
		}
		
		System.out.println();


//			for (int j = 0; j<tab.size()-1;j++) {
//				if(tab.get(j).getRayon()>tab.get(j+1).getRayon()){
//
//					Cercle temp = tab.get(j+1);
//					tab.set(j+1, tab.get(j));
//					tab.set(j, temp);
//					
//				}
//			}
//		
//			
//			System.out.println();
//		
//		Iterator<Cercle> iter = tab.iterator();
//		while (iter.hasNext()) {
//			
//			System.out.print(iter.next().getRayon()+" || ");
//		}

//		 System.out.print("Temps écoulé en millisecondes = ");
//	     System.out.println(System.currentTimeMillis());
		
	}

}
