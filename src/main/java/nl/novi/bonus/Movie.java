package nl.novi.bonus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {

  private String titleMovie;
  private String director;
  private LocalDate releaseDate; // THis must maybe a different type or instance google this!
  private ArrayList<String> genre;

  public Movie() {

  }

  public Movie(String titleMovie, String director, LocalDate releaseDate, ArrayList genre) {
    this.titleMovie = titleMovie;
    this.director = director;
    this.releaseDate = releaseDate;
    this.genre = genre;
  }

  public void generateSummary() {
    System.out.println("The Director of the mobie is: " + this.director);
    System.out.println("The releasedate is: " + this.releaseDate);
    System.out.println("The type of genre of this movie is a ");
    printGenre();
  }

  public void printGenre() {
    for (String genre : genre) {
      System.out.println(genre);
    }
  }
}
