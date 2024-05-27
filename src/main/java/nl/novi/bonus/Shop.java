package nl.novi.bonus;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Shop {

  private ArrayList<Product> products = new ArrayList<>();

  public Shop() {
    // set a few defaults behaviours
    Product cola = new Product("cola", 4);
    Product hertogJan = new Product("hertog Jan beer", 5);
    Product candles = new Product("candles", 10);
    products.add(cola);
    products.add(hertogJan);
    products.add(candles);
  }

  public void addProduct(String name, int amount) {
    Product product = new Product(name.toLowerCase(), amount);
    products.add(product);
  }

  public void printOutStock() {
    for (Product product : products) {
      System.out.println(product.getProduct() + " - " + product.getAmmount());
    }
  }

  public void sellProduct(String productName, int sellingAmount) {
    for (Product product : products) {
      if (product.getProduct().equals(productName.toLowerCase())) {
        int newAmount = product.getAmmount() - sellingAmount;
        if (newAmount < 0) {
          System.out.println("Im sorry, we dont have this much of " + productName);
          System.out.println("If you buy this the stock will be " + newAmount);
          System.out.println("Please try again");
          return;
        }
        product.setAmmount(newAmount);
        System.out.println("Here is your " + sellingAmount + " " + productName + "(s)");
        return;
      }
    }
    System.out.println("Sorry we dont have this in stock!");
  }

}
