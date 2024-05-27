package nl.novi.bonus;

public class WheelType {

  private String brand;
  private double diameter;
  private double profile;

  public WheelType() {
  }

  public WheelType(String brand, double diameter, double profile) {
    this.brand = brand;
    this.diameter = diameter;
    this.profile = profile;
  }

  public short topSpeed() {
    // check if this a correct calculation
    switch (brand) {
      case "michelin":
        return 220;
      case "bridge":
        return 240;
      case "goodyear":
        return 270;
      case "contintental":
        return 290;
      default:
        return 0;
    }
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  public double getProfile() {
    return profile;
  }

  public void setProfile(double profile) {
    this.profile = profile;
  }
}
