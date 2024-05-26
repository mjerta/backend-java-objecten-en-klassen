package nl.novi;

public class Main {
  public static void main(String[] args) {
    // This will set up two instances of both a different recipe.
    ApplePieRecipe applePieRecipe = new ApplePieRecipe();
    MealSaladRecipe mealSaladRecipe = new MealSaladRecipe();

    // Printing out everthing needed for the apple pie recipe.
    System.out.println(applePieRecipe.getTitle());
    System.out.println();
    applePieRecipe.printIngredients();
    System.out.println();
    applePieRecipe.printOutStepsOfRecipe();
    System.out.println();

    // Printing out everthing needed for the meal salad recipe.
    System.out.println(mealSaladRecipe.getTitle());
    System.out.println();
    mealSaladRecipe.printIngredients();
    System.out.println();
    mealSaladRecipe.printOutStepsOfRecipe();
    System.out.println();
  }
}