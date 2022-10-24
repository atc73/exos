package exo5.models;

public class A {
    public int n ; // ici, exceptionnellement, pas d'encapsulation
    public int p = 10 ;

    public void setP(int p) {
        this.p = p;
    }

    public int getP() {
        return p;
    }

    public A (int nn) {
        System.out.println ("Entree Constr A - n=" + n + " p=" + p) ;
        n = nn ;
        System.out.println ("Sortie Constr A - n=" + n + " p=" + p) ;
    }
}

