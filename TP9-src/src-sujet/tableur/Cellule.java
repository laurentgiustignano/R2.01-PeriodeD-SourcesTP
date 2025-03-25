// Cellule.java
package tableur;

public abstract class Cellule {
  public abstract int évaluer();

  @Override
  public String toString() {
    return Integer.toString(évaluer());
  }
}
