// CelluleAddition.java
package cellules;

import tableur.Cellule;
import tableur.Coord;
import tableur.Tableur;

public class CelluleAddition extends Cellule {
  private Tableur t;
  private Coord c1, c2;
  
  public CelluleAddition(Tableur t, Coord c1, Coord c2) {
    assert(t.coordCorrecte(c1) && t.coordCorrecte(c2));
    this.t = t;
    this.c1 = c1;
    this.c2 = c2;
  }
  
  @Override
  public int evaluer () {
    return t.get(c1).evaluer() + t.get(c2).evaluer();
  }
}
