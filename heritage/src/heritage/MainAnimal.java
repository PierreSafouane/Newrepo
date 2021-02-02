package heritage;

public class MainAnimal {
	
	static int comptchat;
	static int comptchien;
	static int comptsouris;
	static int comptan;
	

	public static int countAnimal(String type,Animal...a) {
		for (Animal animals : a) {
//			animals.afficherNom();
			String clname =animals.getClass().getSimpleName();
			
			
			switch(clname) {
			case "Chat":
				comptchat++;
				comptan++;
				break;
				
			case "Chien":
				comptchien++;
				comptan++;
				break;
				
			case "Souris":
				comptsouris++;
				comptan++;
				break;
			}	
			
		}
		
		switch(type.toLowerCase()) {
		case "chat":
		System.out.println("Vous avez : "+comptchat+" chat(s)");
		break;
		
		case "chien":
		System.out.println("Vous avez : "+comptchien+" chien(s)");
		break;
		
		case "souris":
		System.out.println("Vous avez : "+comptsouris+" souris");
		break;
		
		case "animaux":
		System.out.println("vous avez : "+comptan+" animal(aux)");
		break;
		
		case "animal":
		System.out.println("vous avez : "+comptan+" animaux");
		break;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		Chat c1 = new Chat(5, "chat1", "roux");
		Chien t1 = new Chien (6,"chien1","noir");
		Souris s1 = new Souris (2,"souris1","blanc");
		Souris s2 = new Souris (1,"souris2","marron");
		Chien t2 = new Chien (6,"chien2","blanc");
		Chien t3 = new Chien (6,"chien3","gris");
		
		
		
		countAnimal("souris",c1,t1,s1,s2,t2,t3);
		

	}

}
