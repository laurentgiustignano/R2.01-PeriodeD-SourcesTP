package géométrie;
import java.util.Random;

public enum Direction {
  EST(1, 0), NORD_EST(1, 1), NORD(0, 1), NORD_OUEST(-1, 1), OUEST (-1, 0), SUD_OUEST(-1, -1), SUD(0, -1), SUD_EST(1, -1);
  
  // déplacement relatif de la direction
  private final int dx, dy;

  private Direction(int dx, int dy) {
    this.dx = dx; this.dy = dy;
  }

  /** Retourne le déplacement sur l'axe des x correspondant à la
   * direction courante.
   * @return le déplacement en x
   */
  public int getDx() {
    return dx;
  }

  /** Retourne le déplacement sur l'axe des y correspondant à la
   * direction courante.
   * @return le déplacement en y
   */
  public int getDy() {
    return dy;
  }
  /** Retourne une direction inverse à la direction courante.
   * @return la direction opposée
   */
  public Direction inverser() {
    return Direction.values()[(this.ordinal() + 4) % 8];
  }
  
  /** Retourne une direction dérivée par rapport à la 
   * direction courante d'un angle aléatoirement choisi et
   * compris entre (-marge * 45°) et (+marge * 45°). La dérivation
   * est choisie nécessairement pour être un multiple de 45°.
   * @param marge la tolérance
   * @return la nouvelle direction
   */
  public Direction dériver(int marge) {
    Random rd = new Random();
    int d = (8 + this.ordinal() + (rd.nextInt(marge * 2 + 1) - marge)) % 8;
    return Direction.values()[d];
  }
}
