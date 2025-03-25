// CelluleVide.java
package cellules;

import tableur.Cellule;

public class CelluleVide extends Cellule {
  @Override
  public int évaluer() {
    return 0;
  }
  
  @Override
  public String toString() {
    return ".";
  }
}
