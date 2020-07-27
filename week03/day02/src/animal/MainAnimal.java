package animal;

public class MainAnimal {
  public static void main(String[] args) {
    Animal pokemon = new Animal(50, 50);

    System.out.println("Before: " + pokemon.getHunger());
    pokemon.eat();
    System.out.println("After eating: " + pokemon.getHunger());
    pokemon.drink();
    System.out.println("After drinking: " + pokemon.getHunger());

    System.out.println("before anything: " + pokemon.setHunger(50));
  }
}
