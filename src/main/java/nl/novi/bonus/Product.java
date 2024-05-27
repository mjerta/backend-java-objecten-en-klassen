package nl.novi.bonus;

public class Product {
  private String product;
  private int amount;

  public Product() {

  }

  public Product(String product, int amount) {
    this.product = product;
    this.amount = amount;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String cola) {
    this.product = product;

  }

  public int getAmmount() {
    return amount;
  }

  public void setAmmount(int amount) {
    this.amount = amount;
  }

}
