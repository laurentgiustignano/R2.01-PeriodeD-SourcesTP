// Appli.java
package client;

import voiture.*;

public class Appli {
  public static final int MAX = 130;

  public static int testMoteur(Voiture v) {
    int cpt = 0;
    v.setVitesse(0);
    while (v.getVitesse() < MAX) {
      v.accelerer();
      ++cpt;
    }
    while (v.getVitesse() > 0)
      v.freiner();
    return cpt;
  }

  public static void main(String[] args) {
    Voiture[] tab = { 
        new Voiture("607"),
    };
    for (Voiture v : tab) {
      int nb = testMoteur(v);
      System.out.println(v + " -> " + nb);
    }
  }
}
