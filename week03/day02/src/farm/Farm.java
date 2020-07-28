package farm;

import animal.Animal;
import java.util.List;

public class Farm {
  List<Animal> animals;
  int freePlaces;

  public void breed() {
    if (freePlaces != 0) {
      Animal newAnimal = new Animal();
      animals.add(newAnimal);
      freePlaces--;
    }
  }

  public void slaughter() {

  }

}
