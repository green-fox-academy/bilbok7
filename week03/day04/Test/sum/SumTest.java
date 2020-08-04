package sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {
  Sum adder;

  @BeforeEach
  void setup() {
    adder = new Sum();
  }

  @Test
  void sumSumsNumbersRight() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(10);
    try {
      assertEquals(15, adder.sum(numbers));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void sumSumsNumbersRight2() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(10);
    try {
      assertEquals(15, adder.sum(numbers));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
