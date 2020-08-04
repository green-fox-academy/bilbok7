package sharpieSet;

import sharpie.Sharpie;

public class SharpieSetMain {
  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("yellow", 10);
    Sharpie sharpie1 = new Sharpie("green", 3);
    Sharpie sharpie2 = new Sharpie("black", 15);

    for (int i = 0; i <  107; i++) {
      sharpie.use();
      sharpie1.use();
    }

    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.add(sharpie);
    sharpieSet.add(sharpie1);
    sharpieSet.add(sharpie2);

    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
    System.out.println(sharpieSet.sharpies.size());

  }
}
