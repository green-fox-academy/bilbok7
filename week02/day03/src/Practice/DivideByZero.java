package Practice;

import java.io.IOException;

public class DivideByZero {
  public static void main(String[] args) {
    System.out.println(dividesTen(0));

  }

  public static int dividesTen(int number) {
    int result = 0;
    try {
      result = 10 / number;
    } catch (ArithmeticException e) {
      System.out.println("Fail");
    }
    return result;


  }
}
