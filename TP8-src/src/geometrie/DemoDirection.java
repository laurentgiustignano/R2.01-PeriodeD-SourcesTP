package geometrie;
import java.util.EnumSet;

public class DemoDirection {
  public static void main(String[] args) {
    Direction d = Direction.EST;      // 8 directions possibles
    System.out.println(d);            // affichage possible
    d = d.inverser();                 // retourne la direction inverse
    System.out.println(d);
    d = d.deriver(1);                 // changement aléatoire de direction
    System.out.println(d);
    System.out.println(d.inverser());
    
    // Pour toutes les directions possibles faire ...
    for (Direction dd : Direction.values())
      System.out.println(dd + " -> " + dd.inverser());
    
    // Pour toutes les directions que voici faire ...
    for (Direction dd : EnumSet.of(Direction.NORD, Direction.EST, Direction.SUD_EST))
      System.out.println(dd + " => " + dd.inverser());
    
    // Pour toutes les directions comprises entre x et y (inclues) faire ...
    for (Direction dd : EnumSet.range(Direction.EST, Direction.NORD_OUEST))
      System.out.println(dd + " >> " + dd.inverser());
  }
}
