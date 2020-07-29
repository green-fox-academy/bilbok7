package recursion;

public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(bunny(113));
  }

  public static int bunny(int n) {
    if (n % 2 == 0) {
      if (n == 0) {
        return 0;
      } else {
        n--;
        return 3 + bunny(n);
      }
    } else {
      if (n == 0) {
        return 0;
      } else {
        n--;
        return 2 + bunny(n);
      }
    }
  }
}
