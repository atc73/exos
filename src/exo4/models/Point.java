package exo4.models;

public class Point {
    private int x, y ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void affiche() {
        System.out.println ("Coordonnees : " + x + " " + y) ;
    }
}



