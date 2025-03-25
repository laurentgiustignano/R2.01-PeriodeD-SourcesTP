package anneaux;

public class AnneauClignotant extends Anneau {
  private boolean cligné;

  public AnneauClignotant(int x, int y) {
    super(x, y);
    cligné = false;
  }

  @Override
  public char getSymbole() {
    cligné = !cligné;
    char c = super.getSymbole();
    if (cligné)
      return Character.toUpperCase(c);
    return Character.toLowerCase(c);
  }
}
