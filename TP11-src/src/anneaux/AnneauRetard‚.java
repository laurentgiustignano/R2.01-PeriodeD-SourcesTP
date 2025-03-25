// AnneauRetardé.java
package anneaux;

public class AnneauRetardé extends Anneau {
  private int xOld, yOld;
  private boolean parti;

  public AnneauRetardé(int x, int y) {
    super(x, y);
    parti = false;
  }

  @Override
  public void déplacer(Anneau précédent, int xMax, int yMax) {
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
