package counter;

public class Counter {
  private int value;
  private int initialValue;

  public Counter(int value) {
    this.value = value;
    this.initialValue = value;
  }

  public Counter() {
    this(0);
  }

  public void add(int number) {
    this.value += number;
  }

  public void add() {
    this.value++;
  }

  public int get() {
    return value;
  }

  public void reset() {
    this.value = initialValue;
  }
}
