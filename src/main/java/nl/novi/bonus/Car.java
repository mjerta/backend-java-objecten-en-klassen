package nl.novi.bonus;

public class Car {
  private double engineCapacity;
  private String color;
  private String fuel;
  private String brand;
  Engine engine;
  WheelType wheelType;
  private short topSpeed;

  // the next field will be used to determine how many kilometers are driven and when the get gasoline
  private int amountOfKilometers;
  private int amountOfFuel;

  private Car(Builder builder) {
    this.engineCapacity = builder.engineCapacity;
    this.color = builder.color;
    this.fuel = builder.fuel;
    this.brand = builder.brand;
    this.engine = builder.engine;
    this.wheelType = builder.wheelType;
    this.topSpeed = wheelType.topSpeed();
  }

  // I will make a builder because the parameters will get a lot in the constructor

  public static class Builder {
    private double engineCapacity;
    private short topSpeed;
    private String color;
    private String fuel;
    private String brand;
    private Engine engine;
    private WheelType wheelType;

    public Builder engineCapacity(double engineCapacity) {
      this.engineCapacity = engineCapacity;
      return this;
    }

    public Builder color(String color) {
      this.color = color;
      return this;
    }

    public Builder fuel(String fuel) {
      this.fuel = fuel;
      return this;
    }

    public Builder brand(String brand) {
      this.brand = brand;
      return this;
    }

    public Builder engine(Engine engine) {
      this.engine = engine;
      return this;
    }

    public Builder wheelType(WheelType wheelType) {
      this.wheelType = wheelType;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }

  public void setAmountOfFuel(int amountOfFuel) {
    this.amountOfFuel = amountOfFuel;
  }

  public void setAmountOfKilometers(int amountOfKilometers) {
    this.amountOfKilometers = amountOfKilometers;
    for (int i = 0; i < amountOfKilometers; i += 10) {
      amountOfFuel += 2;
    }
  }

  public void printOutCarDetails() {
    System.out.println("Nice car you got there. This car has the following:");
    System.out.println();
    System.out.println("The engines capacity is: " + this.engineCapacity);
    System.out.println("The color is: " + this.color);
    System.out.println("The fuel type is: " + this.fuel);
    System.out.println("The brand is: " + this.brand);
    System.out.println("The capacity of the engine is: " + this.engine.getCapacity() + " L");
    System.out.println("The content of the engine is: " + this.engine.getCapacity() + " L");
    System.out.println("The brand of the tires are: " + this.wheelType.getBrand());
    System.out.println("The diameter of the tires are: " + this.wheelType.getDiameter() + " φ");
    System.out.println("The profile of the tires are: " + this.wheelType.getProfile() + " mm");
    System.out.println("And most importantly the topspeed of the car is: " + this.topSpeed + " km/h");

  }

  public void printOutFuelAmmount() {
    if (this.amountOfFuel < 4) {
      System.out.println("Its time to get some fuel");
    } else {
      System.out.println("You still got " + this.amountOfFuel + " of " + this.fuel + " left.");
    }
  }
}
