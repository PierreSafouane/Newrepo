package fr.formation.afpa.exo;


class A {
    public A(int n) throws Erreur_d {
        if (n == 1) {
            Erreur_d e = new Erreur_d();
            e.num = 999;
e.code =12;
throw e;
        }
    }
}