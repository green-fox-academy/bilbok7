package animal;

public class Animal {
  private int hunger;
  private int thirst;

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public Animal() {
    this(50, 50);
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public int getHunger() {
    return hunger;
  }

  public int setHunger(int hunger) {
    this.hunger = hunger;
    return hunger;
  }
}
