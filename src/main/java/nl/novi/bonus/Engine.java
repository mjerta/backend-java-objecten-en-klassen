package nl.novi.bonus;

public class Engine {

  private double capacity;
  private double content;

  public Engine() {
  }

  public Engine(double capacity, double content) {
    this.capacity = capacity;
    this.content = content;
  }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  public double getContent() {
    return content;
  }

  public void setContent(double content) {
    this.content = content;
  }
}
