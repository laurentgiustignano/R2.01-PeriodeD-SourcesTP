// Tête.java
package anneaux;

import géométrie.Direction;

public class Tête extends Anneau {
  private Direction cap;

  public Tête(int x, int y, Direction cap) {
    super(x, y);
    this.cap = cap;
  }

  public Tête(int x, int y) {
    this(x, y, Direction.EST);
  }

  @Override
  public void déplacer(Anneau précédent, int xMax, int yMax) {
    assert (précédent == null);
    if (getX() == 0 || getX() == xMax || getY() == 0 || getY() == yMax)
      cap = cap.inverser();
    else
      cap = cap.dériver(1);
    placerA(getX() + cap.getDx(), getY() + cap.getDy());
  }

  @Override
  public char getSymbole() {
    return 't';
  }
}
