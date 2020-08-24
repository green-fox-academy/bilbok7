package exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("h", "o", "l", "l", "ó", "k", "é", "p", "ű");
        String concatenate = strings.stream()
            .map(c -> c.toString())
            .collect(Collectors.joining(""));
    System.out.println(concatenate);
  }
}
