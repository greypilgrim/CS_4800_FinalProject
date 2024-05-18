import java.util.List;
import java.util.ArrayList;
public class Meal {
    private String name;
    private List<String> ingredients;
    private int fats;
    private int carbs;
    private int protein;
    private List<String> toppings;

    public Meal(String name, List<String> ingredients, int fats, int carbs, int protein) {
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients);
        this.fats = fats;
        this.carbs = carbs;
        this.protein = protein;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }

    public Meal clone() {
        Meal clone = new Meal(name, new ArrayList<>(ingredients), fats, carbs, protein);
        clone.toppings.addAll(toppings);
        return clone;
    }
}
