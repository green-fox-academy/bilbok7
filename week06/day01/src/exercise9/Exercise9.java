package exercise9;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    String string = "koxoskoxok";
    Map<String, Long> charactersFrequency =
        Arrays.stream(string.split(""))
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    charactersFrequency.forEach((k, v) -> System.out.println(k + ": " + v));
  }
}
