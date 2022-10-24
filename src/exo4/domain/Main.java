package exo4.domain;


import exo4.models.PointNom;

public class Main {
    public static void main(String[] args) {

        PointNom point = new PointNom(12, 11, "ad");
        point.setY(18);
        point.setName("danny");
        point.affiche2();
    }
}
