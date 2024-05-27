package nl.novi.bonus;

import java.util.ArrayList;

public class Zoo {

  private final ArrayList<Animal> listAnimals = new ArrayList<>();
  Animal lion = new Animal("lion", "cats", "Meat", "Savannah enclosure");
  Animal elephant = new Animal("elephant", "Loxodonta africana", "vegetables", "Grassland enclosuree");
  Animal zebra = new Animal("zebra", "Equus quagga", "hay", "Open plains enclosure");
  Animal penguin = new Animal("penquin", "Spheniscus demersus", "sardines", "Cold marine habitat");

  public void setListAnimals() {
    this.listAnimals.add(this.lion);
    this.listAnimals.add(this.elephant);
    this.listAnimals.add(this.zebra);
    this.listAnimals.add(this.penguin);
  }

  public Zoo() {
    setListAnimals();
    printOutAllAnimals();
  }

  public void printOutAllAnimals() {
    for (Animal animal : this.listAnimals) {
      System.out.println(
          "The " + animal.getName() + " lives in the " + animal.getStay() + ", eats " + animal.getFood() + " and is part of the " +
              animal.getSpecies() + "species");
      System.out.println();
    }
  }
}
