package postIt;

import java.awt.Color;

public class MainPostIt {
  public static void main(String[] args) {
    PostIt post1 = new PostIt(Color.orange, "Idea 1", Color.blue);
    PostIt post2 = new PostIt(Color.pink, "Awesome", Color.black);
    PostIt post3 = new PostIt(Color.yellow, "Superb!", Color.green);
  }
}
