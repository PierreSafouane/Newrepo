package fr.formation.afpa.Tp;

public class Test {

	public static void main(String[] args) {
		
		Eleves e1 = new Eleves("Safouane", "Pierre", 1);
		Eleves e2 = new Eleves("LaFlute","Soufiane",2);

		
		Notes.addNote(e1);
		System.out.println();
//		Notes.addNote(e2);
		
		
		System.out.println();
		
//		Notes.noteMax(e1);
//		
//		Notes.noteMin(e1);
		
		Notes.modifierNote2(e1);
		
		Notes.modifierNote(e1);
		
//		Notes.moyElev(e1);
		
//		Notes.moyClass();
		
		Notes.affNote(e1);
		
		

	}

}
