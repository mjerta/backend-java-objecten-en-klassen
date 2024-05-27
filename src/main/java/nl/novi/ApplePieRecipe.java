package nl.novi;

import java.util.ArrayList;

public class ApplePieRecipe {
  // Note: I'm using Arraylist and not List. I know its not a common practice. But this seems to be debatable.
  private final ArrayList<Ingredient> listOfInstances = new ArrayList<>();
  private final ArrayList<String> allStepsOfRecipe = new ArrayList<>();
  private String title = "Apple Pie";

  Ingredient roomBoter = new Ingredient(200, "ongezouten roomboter", "gram");
  Ingredient bastardSuiker = new Ingredient(200, "witte bastard suiker", "gram");
  Ingredient bakMeel = new Ingredient(400, "zelrijzend bakmeel", "gram");
  Ingredient ei = new Ingredient(1, "ei", "stuk(s");
  Ingredient vanilleSuiker = new Ingredient(8, "vanille suiker", "gram");
  Ingredient zout = new Ingredient(1, "zout", "snuf");
  Ingredient appel = new Ingredient(1.5, "appels", "kilo");
  Ingredient kristalSuiker = new Ingredient(75, "kristal suiker", "gram");
  Ingredient kaneel = new Ingredient(3, "kaneel", "theelepels");
  Ingredient paneerMeel = new Ingredient(15, "paneermeel", "gram");

  // This constructor is using two methods to make this class work properly.
  public ApplePieRecipe() {
    setListOfInstances();
    // This is filling the array listOfInstances to make sure this class is working properly.
    setAllSteps();
    // This is filling the array allStepsOfRecipe with all the strings needed to print out all steps.
  }

  public void setListOfInstances() {
    this.listOfInstances.add(this.roomBoter);
    this.listOfInstances.add(this.bastardSuiker);
    this.listOfInstances.add(this.bakMeel);
    this.listOfInstances.add(this.ei);
    this.listOfInstances.add(this.vanilleSuiker);
    this.listOfInstances.add(this.zout);
    this.listOfInstances.add(this.appel);
    this.listOfInstances.add(this.kristalSuiker);
    this.listOfInstances.add(this.kaneel);
    this.listOfInstances.add(this.paneerMeel);
  }

  public void setAllSteps() {
    allStepsOfRecipe.add("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    allStepsOfRecipe.add(
        "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de " +
            "appeltaart.");
    allStepsOfRecipe.add(
        "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg " +
            "en verdeel deze in 3 gelijke delen.");
    allStepsOfRecipe.add("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    allStepsOfRecipe.add("Vet de springvorm in en bestrooi deze met bloem");
    allStepsOfRecipe.add(
        "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te" +
            " bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    allStepsOfRecipe.add(
        "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de " +
            "appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    allStepsOfRecipe.add("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    allStepsOfRecipe.add(
        "Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om " +
            "de bovenkant van het deeg te bestrijken");
    allStepsOfRecipe.add((
        "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en " +
            "goudbruin."));
  }

  // The following method is just present the title of the recipe
  public String getTitle() {
    return title;
  }

  public void printIngredients() {
    for (Ingredient ingredient : this.listOfInstances) {
      System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }
  }

  public void printOutStepsOfRecipe() {
    for (String step : this.allStepsOfRecipe) {
      System.out.println(step);
    }
  }
}