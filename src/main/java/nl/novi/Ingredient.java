package nl.novi;

public class Ingredient {

  private double amount;
  private String name;
  private String unit;

  public Ingredient() {
  }

  public Ingredient(double amount, String name, String unit) {
    this.amount = amount;
    this.name = name;
    this.unit = unit;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUnit() {
    return unit;
  }
}
