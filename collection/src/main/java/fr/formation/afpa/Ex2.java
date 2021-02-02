package fr.formation.afpa;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Ex2 {
	
	public static void main(String[] args) {
		
//		DecimalFormat df = new DecimalFormat ( ) ;
//		df.setMinimumFractionDigits ( 5 );
//		
//		
//		long start = System.currentTimeMillis();
//		
//		Instant d = Instant.now();

		ArrayList<Integer> tab = new ArrayList<Integer>();
		tab.add(1);
		tab.add(2);
		tab.add(3);
		tab.add(4);
		tab.add(-5);
		tab.add(-9);
		tab.add(-8546);

		System.out.println(tab);
//		
//		for (int value : tab) {
//			System.out.println(value);
//		}

//		Collections.reverse(tab);
//		
//		System.out.println(tab);

//		for (int i = 0; i < tab.size(); i+=2) {
//			System.out.println(tab.get(i));
//		}

		for (int h = 0; h < tab.size(); h++) {
			if (tab.get(h) < 0) {
				tab.set(h, 0);
			}
		}
		System.out.println(tab);
		
//		long finish = System.currentTimeMillis();
//		
//		long timeElapsed = finish - start;
//		
//		Instant f = Instant.now();
//				
//		System.out.println("Temps écoulé en millisecondes: "+df.format(Duration.between(d, f).toMillis()));
//		
//		System.out.println("Temps écoulé en minutes: "+df.format(Duration.between(d, f).toMinutes()));
//		
//		System.out.println("Temps écoulé en millisecondes: "+df.format(timeElapsed));


//		Iterator<Integer> it = tab.iterator();
//		while (it.hasNext()) {
//			if (it.next() <0)
//				it.remove();
//		}
//		System.out.println(tab);

	}
}
