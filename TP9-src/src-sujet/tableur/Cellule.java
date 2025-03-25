// Cellule.java
package tableur;

public abstract class Cellule {
  public abstract int evaluer ();

  @Override
  public String toString() {
    return Integer.toString(evaluer());
  }
}
