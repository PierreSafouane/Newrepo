package pack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int compt;
		
//		System.out.println(Ackermann.fonctiondAckermann2(0, 0));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tapez le num de début >=0");
		compt = sc.nextInt();
		Ex10.debut(compt);
		
		Ex10 e1 = new Ex10();
		Ex10 e2 = new Ex10();
		Ex10 e3 = new Ex10();
		
		System.out.println(e1.getIdent()+" "+e2.getIdent()+" "+e3.getIdent());
		System.out.println(Ex10.getIdentMax()+" "+Ex10.nbObjet());
		
		Ex10 e4 = new Ex10();
		Ex10 e5 = new Ex10();
		System.out.println(e4.getIdent()+" "+e5.getIdent());
		System.out.println(Ex10.getIdentMax()+" "+Ex10.nbObjet());
		
	}

}
