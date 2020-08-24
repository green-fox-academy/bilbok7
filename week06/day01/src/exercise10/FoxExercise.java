package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoxExercise {

  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();

    foxes.add(new Fox("Phoebe", "yellow", 30));
    foxes.add(new Fox("Chandler", "blue", 32));
    foxes.add(new Fox("Rachel", "pink", 29));
    foxes.add(new Fox("Monica", "green", 2));
    foxes.add(new Fox("Ross", "brown", 31));
    foxes.add(new Fox("Joey", "green", 29));

    List<Fox> greenFoxes = foxes.stream()
        .filter(fox -> fox.getColor().equals("green"))
        .collect(Collectors.toList());
    System.out.println(greenFoxes);

    List<Fox> greenFoxesYoungerThanFive = foxes.stream()
        .filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
        .collect(Collectors.toList());
    System.out.println(greenFoxesYoungerThanFive.toString());

    Map<String, Long> foxesByColor = foxes.stream()
        .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
    System.out.println(foxesByColor);
  }
}

