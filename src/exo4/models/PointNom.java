package exo4.models;

public class PointNom extends Point{
    private String name;

    public PointNom(int x, int y, String name) {
        setX(x);
        setY(y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void affiche () {
        super.affiche();
        System.out.println(name);
    }
}
