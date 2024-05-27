package nl.novi.bonus;

import java.util.Date;

public class Movie {

  private String director;
  private String releaseDate; // THis must maybe a different type or instance google this!
  private String genre;
  Date date = new Date();
  public Movie() {

    date.
  }

  public Movie(String director, String releaseDate, String genre) {
    this.director = director;
    this.releaseDate = releaseDate;
    this.genre = genre;
  }

  public void generateSummary() {
    System.out.println("The Director of the mobie is: " + this.director);
    System.out.println("The releasedate will be at " + this.releaseDate);
    System.out.println("The type of genre of this movie is a " + genre);
  }
}
