package nl.novi.bonus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Opdracht 1: Film
    System.out.println("Opdracht1: Film");
    System.out.println();
    String titleMovie = "The Terminator";
    String director = "James Cameron";
    LocalDate releasdate = LocalDate.of(1984, 10, 26);
    ArrayList<String> genre = new ArrayList<>();
    genre.add("Action");
    genre.add("Science Fiction");
    genre.add("Thriller");

    Movie theTerminator = new Movie(titleMovie, director, releasdate, genre);
    theTerminator.generateSummary();
    System.out.println();

    // Opdracht 2: winkel
    System.out.println("Opdracht2: Winkel");
    System.out.println();
    Shop shop = new Shop();
    shop.addProduct("Chocolatebar", 6);
    shop.printOutStock();
    System.out.println();
    shop.sellProduct("cola", 5);
    System.out.println();
    System.out.println("Updated stock list: ");
    shop.printOutStock();
    System.out.println();
    shop.sellProduct("chocolatebar", 5);
    System.out.println();
    System.out.println("Updated stock list: ");
    shop.printOutStock();
    System.out.println();

    // Opdracht 3: Bedrijf
    System.out.println("Opdracht3: Bedrijf");
    System.out.println();
    Manager companyManager = new Manager("Maarten Postma", 33);
    Company company = new Company("mpdev", companyManager);
    company.printOutDetailsCompany();
    System.out.println();

    // Opdracht 4: Dierentuin
    System.out.println("Opdracht4: Dierentuin");
    System.out.println();
    Zoo zoo = new Zoo(); //  The constructor will by default print all details.
    System.out.println();

    // Opdracht 5: Auto
    System.out.println("Opdracht 5: Auto");
    Engine v8 = new Engine(2.0, 4.2);
    WheelType michellin = new WheelType("michelin", 25, 40);

    Car toyota = new Car.Builder()
        .engineCapacity(2.5)
        .color("Red")
        .fuel("Petrol")
        .brand("Toyota")
        .engine(v8)
        .wheelType(michellin)
        .build();

    toyota.printOutCarDetails();
    System.out.println();
    System.out.println("We are going for a drive!");
    toyota.setAmountOfFuel(40);
    toyota.setAmountOfKilometers(60);
    toyota.printOutFuelAmmount();

  }

}
