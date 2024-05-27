package nl.novi.bonus;

public class WheelType {

  private String brand;
  private double diameter;
  private String profile;

  public WheelType() {
  }

  public WheelType(String brand, double diameter, String profile) {
    this.brand = brand;
    this.diameter = diameter;
    this.profile = profile;
  }

  public short topSpeed() {
    return (short) (diameter * 1.5);
  }

}
