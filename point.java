package point;
public class point {
    private String nom;
    private int abscisse;
    private int ordonnee;

    public point(int x, int y) {
        this.nom = "test";
        this.abscisse = x;
        this.ordonnee = y;
    }

    public point(String n) {
        this.nom = n;
        this.abscisse = 0;
        this.ordonnee = 0;
    }

    public point(String n, int x, int y) {
        this.nom = n;
        this.abscisse = x;
        this.ordonnee = y;
    }

    public void Affiche() {
        System.out.println(this.nom + " (" + this.abscisse + ", " + this.ordonnee + ")");
    }

    public void TranslHoriz(int a) {
        this.abscisse = this.abscisse + a;
    }

    public void TranslVert(int a) {
        this.ordonnee = this.ordonnee + a;
    }

    public void Translation(int a, int b) {
        this.abscisse = this.abscisse + a;
        this.ordonnee = this.ordonnee + b;
    }
t
    public boolean Coincide(point p) {
        if (this.abscisse == p.abscisse &&
            this.ordonnee == p.ordonnee) {
            return true;
        } else {
            return false;
        }
    }
    public String getNom() {
        return this.nom;
    }

    public int getAbscisse() {
        return this.abscisse;
    }

    public int getOrdonnée() {
        return this.ordonnee;
    }
    public void setNom(String ch) {
        this.nom = ch;
    }

    public void setAbscisse(int a) {
        this.abscisse = a;
    }

    public void setOrdonnée(int a) {
        this.ordonnee = a;
    }
}

public class Test_Point {

    public static void main(String[] args) {

        point p1;
        p1 = new point(3, 5);

        point p2 = new point("a");

        point p3 = new point("b", 3, 5);

        System.out.println("\n ---------------------------\n");

        System.out.println("les points créés sont :");

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n ---------------------------\n");

        if (p1.Coincide(p3) == true)
            System.out.println("Les 2 points p1 et p3 coïncident");
        else
            System.out.println("Les 2 points ne coïncident pas");

        System.out.println("\n ---------------------------\n");

        System.out.println("translation des point ");

        p1.TranslHoriz(4);
        p2.TranslVert(3);
        p3.Translation(5, 2);

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n ---------------------------\n");

        System.out.println("modification des attributs des points");

        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnée(50);

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n ---------------------------\n");

        System.out.println("utilisation des méthodes get");

        String x = p1.getNom();
        int y = p1.getAbscisse();
        int z = p1.getOrdonnée();

        System.out.println("le nom du point p1 est : " + x);
        System.out.println("son abscisse est : " + y);
        System.out.println("son ordonnée est : " + z);
    }
}
