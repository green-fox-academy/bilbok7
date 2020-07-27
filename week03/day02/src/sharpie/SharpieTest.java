package sharpie;

public class SharpieTest {
  public static void main(String[] args) {
    Sharpie bluuuu = new Sharpie("blue", 50);
    Sharpie orangeee = new Sharpie("orange", 101);

    orangeee.use();

    System.out.println(orangeee.getInkAmount());
  }
}
