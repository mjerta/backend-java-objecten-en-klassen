package nl.novi.bonus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Opdracht1: Film
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

    // Opdracht2: winkel
    System.out.println("Opdracht2: Winkel");
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

    // Opdracht 3: Bedrijf
    System.out.println("Opdracht3: Bedrijf");
    Manager companyManager = new Manager("Maarten Postma", 33);
    Company company = new Company("mpdev", companyManager);
    company.printOutDetailsCompany();

  }

}
