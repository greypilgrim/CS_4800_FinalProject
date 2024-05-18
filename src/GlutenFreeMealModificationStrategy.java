public class GlutenFreeMealModificationStrategy implements MealModificationStrategy {
    @Override
    public Meal modifyMeal(Meal meal, String dietaryRestriction) {
        meal.removeIngredient("gluten");
        return meal;
    }
}
