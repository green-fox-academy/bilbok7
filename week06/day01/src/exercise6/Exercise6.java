package exercise6;

public class Exercise6 {
  public static void main(String[] args) {
    String uppercase = "asfZUguGUgzuGuzgzuUhjkL";

    uppercase.chars()
        .filter(x -> x == ((int) (Character.toString((char) x).toUpperCase()).charAt(0)))
        .forEach(x -> System.out.println((char) x));
  }
}
