package exo5.models;

public class B extends A {

    public int q=25 ;

    public B (int n, int pp) {
        super (n) ;
        System.out.println ("Entree Constr B - n=" + n + " p=" + p + " q=" + q) ;
        p = pp ;
        q = 2*n ;
        System.out.println ("Sortie Constr B - n=" + n + " p=" + p + " q=" + q) ;
    }
}

