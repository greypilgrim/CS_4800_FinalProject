public class VeganMealModificationStrategy implements MealModificationStrategy {
    @Override
    public Meal modifyMeal(Meal meal, String dietaryRestriction) {
        meal.removeIngredient("meat");
        meal.removeIngredient("dairy");
        return meal;
    }
}
