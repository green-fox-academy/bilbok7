package apple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppleTest {
  static Apples apples;

  @BeforeAll
  public static void setup() {
    apples = new Apples();
  }

  @Test
  public void returnString() {
    assertEquals("apple", apples.getApple());
  }

}
