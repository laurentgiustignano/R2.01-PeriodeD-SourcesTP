// AppliTableur.java
import cellules.*;
import tableur.Coord;
import tableur.Tableur;

public class AppliTableur {
  public static void main(String[] args) {
    final int TAILLE = 5;
    Tableur t = new Tableur(TAILLE, TAILLE);
    Coord c1 = new Coord(0, 0), c2 = new Coord(0, 1);

    t.set(c1, new CelluleConstante(4));
    t.set(c2, new CelluleConstante(2));
    t.set(new Coord(0, 2), new CelluleAddition(t, c1, c2));
    System.out.println(t);
    
    t.set(c2, new CelluleConstante(5));
    System.out.println(t);
  }
}
