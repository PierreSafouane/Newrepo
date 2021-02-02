package fr.formation.afpa.Tp;

import java.awt.List;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Notes {

	static HashMap<Eleves, LinkedList> elevenote = new HashMap<Eleves, LinkedList>();
	static LinkedList<Double> liste = new LinkedList<Double>();
	static Scanner sc = new Scanner(System.in);
	
	
//	ajouter une liste de notes a un eleve precis dans une hashmap (clé : Eleves - valeurs : LinkedList de notes)
	public static void addNote(Eleves e) {
		
//		procedure pour remplir la LinkedList (on traite les cas d'erreurs)
		System.out.println("Veuillez saisir la/les note(s) entre 0 et 20 ou écrire 30 pour fin.");
		double rep = sc.nextDouble();

		while (rep != 30) {
			if (rep < 0 || rep > 20) {
				System.err.println("Erreur commande non reconnue ! Veuillez saisir la/les note(s) ou écrire 30 pour fin.");
				rep = sc.nextDouble();
			}
			if (rep >= 0 && rep <= 20) {
				liste.add(rep);
				System.out.println("Veuillez saisir la/les note(s) ou écrire 30 pour fin.");
				rep = sc.nextDouble();
			}
		}
		
//		lien entre LinkedList de notes (valeur) et l'Eleves (clé)
		if (rep == 30) {
			elevenote.put(e, liste);
			System.out.println("Note(s) ajoutée(s).");
			System.out.println();
		}

	}
	
	
//	methode obsolette
//	public static void affAllNote() {
//
//		for (Map.Entry m : elevenote.entrySet()) {
//			System.out.println(m.getKey().toString() + ", note : " + m.getValue());
//		}
//	}
	
//	fait la moyenne de l'eleve, utile pour la methode moyClass (peut etre utile a l'avenir aussi)
	public static double moyElev(Object object) {
		double compt=0;
		double sum = 0;
		elevenote.get(object);
		Iterator<Double> it = liste.iterator();
		while(it.hasNext()) {
		sum += it.next();
		compt++;
		}
		double moy = sum/compt;
		return moy;
	}
	
//	moyenne de toute les LinkedList de tout les eleves et division par le nombre d'eleves. (fait appel a la methode moyElev)
	public static void moyClass() {
		double moy = 0;
		for (Map.Entry m : elevenote.entrySet()) {
			moy =+ moyElev(m.getValue());
		}
		System.out.println("La moyenne de classe est de : "+moy);
	}
	
	
//	afficher la LinkedList de notes de tel eleve
	public static void affNote(Eleves e) {
		System.out.println(elevenote.get(e));
	}

	
//	modifier une note peut importe l'ordre et l'ajouter peut importe l'ordre
	public static void modifierNote(Eleves e) {

		System.out.println(elevenote.get(e));
		System.out.println("Quelle note voulez-vous modifier ?");
		double modif = sc.nextDouble();
		liste.remove(new Double(modif));
		System.out.println("Quelle est la nouvelle valeur de la note ? (entre 0 et 20)");
		double nouvnot = sc.nextDouble();
		while (nouvnot < 0 || nouvnot > 20) {
			System.err.println("Veuillez saisir une note entre 0 et 20");
			nouvnot = sc.nextDouble();
		}
		liste.add(nouvnot);
		System.out.println();
		System.out.println(elevenote.get(e));

	}
	
	
//	modifier la note de tel position et la modifier et reste au final a la meme position
	public static void modifierNote2(Eleves e) {

		System.out.println(elevenote.get(e));
		System.out.println("Quelle est la position de la note que voulez-vous modifier ?");
		int modif = sc.nextInt();
		liste.remove(modif-1);
		System.out.println("Quelle est la nouvelle valeur de la note ? (entre 0 et 20)");
		double nouvnot = sc.nextDouble();
		while (nouvnot < 0 || nouvnot > 20) {
			System.err.println("Veuillez saisir une note entre 0 et 20");
			nouvnot = sc.nextDouble();
		}
		liste.add(modif-1, nouvnot);
		System.out.println();
		System.out.println(elevenote.get(e));

	}
	
	public static void noteMax(Eleves e) {
		Double max ;
		Collection<LinkedList> it = elevenote.values();
		for (LinkedList l : it) {
			LinkedList<Double> t = new LinkedList<Double>(l);
			Collections.sort(t);
		Double not=(Double) t.getLast();
		System.out.println(not);
		}
	}
	
	public static void noteMin(Eleves e) {
		Double min ;
		Collection<LinkedList> it = elevenote.values();
		for (LinkedList l : it) {
			LinkedList<Double> t = new LinkedList<Double>(l);
			Collections.sort(t);
		Double not=(Double) t.getFirst();
		System.out.println(not);
		}
	}

}