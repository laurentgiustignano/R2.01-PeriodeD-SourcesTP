// Anneau.java
package anneaux;

public class Anneau {
  private int x, y;

  public Anneau(int x, int y) {
    placerA(x, y);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void placerA(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void deplacer (Anneau précédent, int xMax, int yMax) {
    placerA(précédent.getX(), précédent.getY());
  }

  public char getSymbole() {
    return 'a';
  }
  
  public void dessiner(char[][] t) {
    t[x][y] = getSymbole();
  }
}
