package fr.formation.afpa.exceptions;

public class Chemin2 {

	 

    public static void main(String[] args) {
        f(true);
        System.out.println("apres f(true)");
        f(false);
        System.out.println("apres f(false)");
    }

 

    public static void f(boolean ret) {
        try {

            A a = new A(1);

        } catch (Except e)

        {
            System.out.println("** Dans f - exception Erreur");
            if (ret)
                return;
        }

        System.out.println("suite f");

    }

 

}
