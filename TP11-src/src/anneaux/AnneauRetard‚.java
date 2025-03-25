// AnneauRetardé.java
package anneaux;

public class AnneauRetarde extends Anneau {
  private int xOld, yOld;
  private boolean parti;

  public AnneauRetarde (int x, int y) {
    super(x, y);
    parti = false;
  }

  public void deplacer (Anneau précédent, int xMax, int yMax) {
    if (parti)
      placerA(xOld, yOld);
    xOld = précédent.getX();
    yOld = précédent.getY();
    parti = true;
  }

  @Override
  public char getSymbole() {
    return 'r';
  }
}
