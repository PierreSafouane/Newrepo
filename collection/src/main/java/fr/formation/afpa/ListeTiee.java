package fr.formation.afpa;

import java.util.Iterator;
import java.util.TreeSet;

public class ListeTiee {
	
	public static void ajoute (TreeSet <Cercle> tab, Cercle ajout) {
		
		tab.add(ajout);
		
	}
	
	public static void affiche (TreeSet <Cercle> tab) {
		Iterator<Cercle> it = tab.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().rayon+" || ");
		}
	}
	
	public static void main(String[] args) {
		
		Cercle a = new Cercle(1, 2, 3);
		Cercle b = new Cercle(4, 5, 6);
		Cercle c = new Cercle(6, 5, 4);
		Cercle d = new Cercle(3, 2, 1);
		
		TreeSet<Cercle> tab = new TreeSet<Cercle>();
		
		ListeTiee.ajoute(tab, a);
		ListeTiee.ajoute(tab, b);
		ListeTiee.ajoute(tab, c);
		ListeTiee.ajoute(tab, d);
		
		ListeTiee.affiche(tab);
		
		System.out.println();
		
		Cercle e = new Cercle(8,3,3.5);
		
		ListeTiee.ajoute(tab, e);
		
		ListeTiee.affiche(tab);
		
	}

}
