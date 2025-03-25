// CelluleConstante.java
package cellules;

import tableur.Cellule;

public class CelluleConstante extends Cellule {
  private int valeur;

  public CelluleConstante(int v) {
    valeur = v;
  }
  
  @Override
  public int évaluer() {
    return valeur;
  }
}
