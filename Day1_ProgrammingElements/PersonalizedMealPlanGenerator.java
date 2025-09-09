package Generics.Day1_ProgrammingElements;
import java.util.*;

interface MealPlan {
    String getPlanName();
    List<String> getMeals();
}

class VegetarianMeal implements MealPlan {
    public String getPlanName() { return "Vegetarian Meal Plan"; }
    public List<String> getMeals() {
        return Arrays.asList("Salad", "Paneer Curry");
    }
}

class VeganMeal implements MealPlan {
    public String getPlanName() { return "Vegan Meal Plan"; }
    public List<String> getMeals() {
        return Arrays.asList("Tofu Scramble", "Vegan Burger", "Quinoa Salad");
    }
}

class KetoMeal implements MealPlan {
    public String getPlanName() { return "Keto Meal Plan"; }
    public List<String> getMeals() {
        return Arrays.asList("Grilled Chicken", "Avocado Salad", "Keto Pancakes");
    }
}

class HighProteinMeal implements MealPlan {
    public String getPlanName() { return "High Protein Meal Plan"; }
    public List<String> getMeals() {
        return Arrays.asList("Egg Omelette", "Protein Shake", "Grilled Fish");
    }
}

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() { return mealPlan; }
}

class MealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(Meal<T> meal) {
        System.out.println("Generated: " + meal.getMealPlan().getPlanName());
        System.out.println("Meals: " + meal.getMealPlan().getMeals());
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarian = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> vegan = new Meal<>(new VeganMeal());
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> protein = new Meal<>(new HighProteinMeal());

        MealPlanGenerator.generatePlan(vegetarian);
        MealPlanGenerator.generatePlan(vegan);
        MealPlanGenerator.generatePlan(keto);
        MealPlanGenerator.generatePlan(protein);
    }
}
