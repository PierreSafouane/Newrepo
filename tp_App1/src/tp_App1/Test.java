package tp_App1;

public class Test {

	public static void main(String[] args) {
		
//		Adresse l = new Adresse("Nord", "Lille", 59000);
//		
//		System.out.println(l.zip);
//		
//		l.zip = 59100;
//		
//		System.out.println(l.zip);
//		
//		l.ville = "Roubaix";
//		
//		System.out.println(l.ville);
//		
//		System.out.println(l.toString());
		
		Chercheur ch = new Chercheur("Pogba", "MC", 12345);
		
//		System.out.println(ch.nomch+" "+ch.poste+ " "+ch.numPc);
		
//		System.out.println(ch.toString());
		
		Chercheur ch2 = new Chercheur("burak","BU",4298461);
	
		Chercheur ch3 = new Chercheur("andré","MC",456789);
		
		Chercheur ch4 = new Chercheur("bamba","MG",456156);
		
		Chercheur ch5 = new Chercheur("pepe","MD",4949056);
		
		Chercheur ch6 = new Chercheur("fonte","DC",848262);
		
		Bureau b1 = new Bureau(415,"1");
		
		Bureau b2 = new Bureau(9494,"2");
		
		b2.ajout(ch5);
		b2.ajout(ch6);
		Bureau b3 = new Bureau(56456, "3");
		
//		b1.verifChercheur(ch,ch2,ch3,ch4,ch5,ch6);
		
		System.out.println(b3.toString());
		
		
	}

}
