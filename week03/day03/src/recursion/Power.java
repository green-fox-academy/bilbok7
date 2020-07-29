package recursion;

public class Power {
  public static void main(String[] args) {
    System.out.println(power(5, 2));
  }

  public static int z = 0;

  private static int power(int base, int n) {

    if (n > 0) {
      n--;
      z = base * base;
      return power(base, n);
    } else {
      return z;
    }
  }
}
