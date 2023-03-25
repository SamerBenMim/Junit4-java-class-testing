import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

public class Main {
    public static void main(String[] args) {
        SommeArgent sommeArgent = new SommeArgent(2, "$");
        SommeArgent sommeArgent1 = new SommeArgent(8, "£");

        PorteMonnaie p = new PorteMonnaie();
        p.ajouteSomme(sommeArgent);
        p.ajouteSomme(sommeArgent);
        p.ajouteSomme(sommeArgent1);

        System.out.println(p.toString());
    }
}