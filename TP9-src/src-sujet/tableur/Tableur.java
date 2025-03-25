// Tableur.java
package tableur;

import cellules.CelluleVide;

public class Tableur {
  private Cellule tab[][];
  
  public Tableur(int nbLignes, int nbColonnes) {
    assert(nbLignes > 0 && nbColonnes > 0);
    tab = new Cellule[nbLignes][nbColonnes];
    for (int x = 0; x < nbLignes; ++x)
      for (int y = 0; y < nbColonnes; ++y)
        tab[x][y] = new CelluleVide();
  }
  
  public boolean coordCorrecte(Coord c) {
    return 0 <= c.colonne && 
           c.colonne < getNbColonnes() &&
           0 <= c.ligne && 
           c.ligne < getNbLignes();
  }
  
  public void set(Coord c, Cellule cell) {
    assert(coordCorrecte(c));
    tab[c.ligne][c.colonne] = cell;
  }
  
  public Cellule get(Coord c) {
    assert(coordCorrecte(c));
    return tab[c.ligne][c.colonne];
  }

  public int getNbLignes() {
    return tab.length;
  }
  
  public int getNbColonnes() {
    return tab[0].length;
  }
  
  @Override
  public String toString() {
    String s = "";
    for (Cellule[] t : tab) {
      for (Cellule c : t)
        s += c + " ";
      s += "\n";
    }
    return s;
  }
}
