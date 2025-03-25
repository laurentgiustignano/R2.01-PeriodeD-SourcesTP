// Chenille.java
package chenille;

import anneaux.Anneau;
import anneaux.FabriqueAnneau;

public class Chenille {
  private Anneau[] anneaux;

  public Chenille(int nbAnneaux, int x, int y) {
    anneaux = new Anneau[nbAnneaux + 1]; // + 1 pour la tête
    for (int i = 0; i < anneaux.length; ++i)
      anneaux[i] = FabriqueAnneau.getAnneau(i, x - i, y);
  }

  public void deplacer (int xMax, int yMax) {
    // de la queue à la tête
    for (int i = anneaux.length - 1; i > 0; --i)
      anneaux[i].deplacer(anneaux[i - 1], xMax, yMax);
    anneaux[0].deplacer(null, xMax, yMax);
  }

  public void dessiner(char[][] t) {
    // de la queue à la tête
    for (int i = anneaux.length - 1; i >= 0; --i)
      anneaux[i].dessiner(t);
  }
}
