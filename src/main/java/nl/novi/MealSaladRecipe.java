package nl.novi;

import java.util.ArrayList;

public class MealSaladRecipe {
  // Note: I'm using Arraylist and not List. I know its not a common practice. But this seems to be debatable.
  private final ArrayList<Ingredient> listOfInstances = new ArrayList<>();
  private final ArrayList<String> allStepsOfRecipe = new ArrayList<>();
  private String title = "Maaltijdsalade met kip en paksoi";

  Ingredient vermicelli = new Ingredient(200, "vermicelli", "gram");
  Ingredient paprika = new Ingredient(1, "rode paprika", "st.");
  Ingredient paksoi = new Ingredient(1, "paksoi", "st.");
  Ingredient mango = new Ingredient(275, "verse mangostukjes", "gram");
  Ingredient limoen = new Ingredient(1, "biologishe limoen", "st.");
  Ingredient knoflook = new Ingredient(1, "knoflook", "teen");
  Ingredient zonnebloemOlie = new Ingredient(2.5, "zonnebloemolie", "el");
  Ingredient chiliSaus = new Ingredient(2, "zoete chilisaus", "el");
  Ingredient sojaSaus = new Ingredient(1.5, "sojasaus", "el");
  Ingredient sesamOlie = new Ingredient(1.5, "sesamolie", "el");
  Ingredient pindas = new Ingredient(50, "ongezouten pinda's", "gram");
  Ingredient kipFilet = new Ingredient(310, "gerookte-sharrelkipfieltplakjes", "gram");

  // This constructor is using two methods to make this class work properly.
  public MealSaladRecipe() {
    setListOfInstances();
    // This is filling the array listOfInstances to make sure this class is working properly.
    setAllSteps();
    // This is filling the array allStepsOfRecipe with all the strings needed to print out all steps.
  }

  public void setListOfInstances() {
    this.listOfInstances.add(this.vermicelli);
    this.listOfInstances.add(this.paprika);
    this.listOfInstances.add(this.paksoi);
    this.listOfInstances.add(this.mango);
    this.listOfInstances.add(this.limoen);
    this.listOfInstances.add(this.knoflook);
    this.listOfInstances.add(this.zonnebloemOlie);
    this.listOfInstances.add(this.chiliSaus);
    this.listOfInstances.add(this.sojaSaus);
    this.listOfInstances.add(this.sesamOlie);
    this.listOfInstances.add(this.pindas);
    this.listOfInstances.add(this.kipFilet);
  }

  public void setAllSteps() {
    var stepOne
        = "Bereid de noedels volgens de aanwijzingen op de verpakking. Maak ondertussen de paprika schoon en snijd in blokjes. Snijd het " +
        "witte deel van de paksoi fijn en snijd de rest in stukken van 2 cm. Snijd de mangoblokjes in kleinere stukjes.";
    var stepTwo
        = "Boen de limoen schoon, rasp de groene schil en pers de vrucht uit. Snijd de knoflook heel fijn. Meng de olie met de sweet " +
        "chilisaus, knoflook, sojasaus, sesamolie, het limoensap en -rasp tot een dressing. Breng op smaak met peper en eventueel zout. " +
        "Hak de pinda’s grof.";
    var stepThree
        = "Schep de noedels om met de groenten, mango, de helft van de kipfilet en de dressing. Verdeel de rest van de gerookte kipfilet " +
        "erover en bestrooi met de pinda’s.";
    allStepsOfRecipe.add(stepOne);
    allStepsOfRecipe.add(stepTwo);
    allStepsOfRecipe.add(stepThree);
  }

  // The following method is just present the title of the recipe
  public String getTitle() {
    return title;
  }

  public void printIngredients() {
    for (Ingredient ingredient : listOfInstances) {
      System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }
  }

  public void printOutStepsOfRecipe() {
    for (String step : allStepsOfRecipe) {
      System.out.println(step);
    }
  }

}
