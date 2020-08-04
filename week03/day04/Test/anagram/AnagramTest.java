package anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagramTest {
  Anagram anagram;

  @BeforeEach
  void setup() {
    anagram = new Anagram();
  }

  @Test
  void compareTwoString() {
    assertEquals("a", "a");
  }

  @Test
  void compareTwoString2() {
    assertEquals("alma", "marha");
  }

  @Test
  void compareTwoString3() {
    assertEquals("tette", "ttete");
  }
}
