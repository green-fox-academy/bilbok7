package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> squaredNumbersAbove20 = numbers.stream()
        .filter(i -> (i * i) > 20)
        //.map(i -> i*i)
        .collect(Collectors.toList());
    squaredNumbersAbove20.stream()
        .forEach(i -> System.out.println(i));

  }
}