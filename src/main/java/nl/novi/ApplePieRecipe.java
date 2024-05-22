package nl.novi;

import java.util.ArrayList;

public class ApplePieRecipe {
  // LIST evt
  private ArrayList<Ingredient> listOfInstances = new ArrayList<>();
  private ArrayList<String> allStepsOfRecipe = new ArrayList<>();

  Ingredient roomBoter = new Ingredient(200, "ongzouten roomboter", "gram");
  Ingredient bastardSuiker = new Ingredient(200, "witte bastard suiker", "gram");
  Ingredient bakMeel = new Ingredient(400, "zelrijzend bakmeel", "gram");
  Ingredient ei = new Ingredient(1, "ei", "stuk(s");
  Ingredient vanilleSuiker = new Ingredient(8, "vanille suiker", "gram");
  Ingredient zout = new Ingredient(1, "zout", "snuf");
  Ingredient appel = new Ingredient(1.5, "appels", "kilo");
  Ingredient kristalSuiker = new Ingredient(75, "kristal suiker", "gram");
  Ingredient kaneel = new Ingredient(3, "kaneel", "theelepels");
  Ingredient paneerMeel = new Ingredient(15, "paneermeel", "gram");

  public ApplePieRecipe() {
    setListOfInstances();
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

  public void printIngredients() {
    for (Ingredient ingredient : listOfInstances) {
      System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }
//    System.out.println(roomBoter.getAmount() + " " + roomBoter.getUnit() + " " + roomBoter.getName());
//    System.out.println(bastardSuiker.getAmount() + " " + bastardSuiker.getUnit() + " " + bastardSuiker.getName());
//

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

//    Method[] methods = getClass().getDeclaredMethods();
//    for (Method method : methods) {
//      System.out.println(method);
//      try {
//        method.invoke(this);
//      } catch (IllegalAccessException | InvocationTargetException e) {
//        e.printStackTrace();
//      }
//    }

  }

  public void printOutStepsOfRecipe() {
    setAllSteps();
    for (String step : allStepsOfRecipe) {
      System.out.println(step);
    }

  }

  //  public void step1Recipe() {
//    System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
//  }
//
//  public void step2Recipe() {
//    System.out.println(
//        "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de " +
//            "appeltaart.");
//  }
//
//  public void step3Recipe() {
//    System.out.println(
//        "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig
//        deeg " +
//            "en verdeel deze in 3 gelijke delen.");
//  }
//
//  public void step4Recipe() {
//    System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
//  }
//
//  public void step5Recipe() {
//    System.out.println("Vet de springvorm in en bestrooi deze met bloem");
//  }
//
//  public void step6Recipe() {
//    System.out.println(
//        "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm
//        te" +
//            " bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
//  }
//
//  public void step7Recipe() {
//    System.out.println(
//        "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de " +
//            "appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
//  }
//
//  public void step8Recipe() {
//
//    System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
//  }
//
//  public void step9Recipe() {
//    System.out.println(
//        "Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om
//        " +
//            "de bovenkant van het deeg te bestrijken");
//  }
//
//  public void step10Recipe() {
//    System.out.println(
//        "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar
//        en " +
//            "goudbruin.");
//  }

}