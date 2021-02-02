package fr.formation.afpa.exo.flux;

public class ufoiejg {

	public static void main(String[] args) {
		
		String str = "";
		int compt;
		int i = 1;
		int reste;

		if(str.length()<=60) {
			System.out.println(str);
		}
		
		if(str.length()>60) {
			System.out.println(str.subSequence(0, 60));
			compt = str.length()/60;
			reste = str.length()%60;
			while(i<compt) {
				System.out.println(str.substring(i*60,(i+1)*60));
				i++;
				
			}
			System.out.println(str.substring(str.length()-reste,str.length()));
		
		}
		
	}

}
