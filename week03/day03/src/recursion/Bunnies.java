package recursion;

public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunny(1169));

  }

  public static int bunny (int n) {
    if (n == 0) {
      return 0;
    } else {
      n--;
      return 2 + bunny(n);
    }
  }
}
