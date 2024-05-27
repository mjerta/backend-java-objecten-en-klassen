package nl.novi.bonus;

public class Animal {
  private String name;
  private String species;
  private String food;
  private String stay;

  public Animal() {
  }

  public Animal(String name, String species, String food, String stay) {
    this.name = name;
    this.species = species;
    this.food = food;
    this.stay = stay;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getStay() {
    return stay;
  }

  public void setStay(String stay) {
    this.stay = stay;
  }
}
