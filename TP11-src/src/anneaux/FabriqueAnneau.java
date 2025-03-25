// FabriqueAnneau.java
package anneaux;

public class FabriqueAnneau  {
  public static Anneau getAnneau(int num, int x, int y) {
    if (num == 0)
      return new Tête(x, y);
    else if (num % 3 == 0)
      return new AnneauRetardé(x, y);
    else if (num % 2 == 0)
      return new AnneauClignotant(x, y);
    else
      return new Anneau(x, y);
  }
}
