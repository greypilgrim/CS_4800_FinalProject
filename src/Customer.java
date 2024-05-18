import java.time.LocalDateTime;
import java.util.List;

public abstract class Customer {
    protected String name;
    protected String address;
    protected String county;

    public Customer(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
    }

    public void placeOrder(Restaurant restaurant, List<Integer> itemIndices, List<String> toppings) {
        if (restaurant.isOpen(LocalDateTime.now())) {
            Order order = new Order(this, restaurant);
            for (int itemIndex : itemIndices) {
                Meal meal = restaurant.menu.get(itemIndex).clone();
                MealModificationStrategy modificationStrategy = getModificationStrategy();
                if (modificationStrategy != null) {
                    meal = modificationStrategy.modifyMeal(meal, getDietaryRestriction());
                }
                for (String topping : toppings) {
                    meal.addTopping(topping);
                }
                order.addItem(meal);
            }
            CPPFoodDelivery.getInstance().placeOrder(order);
        } else {
            System.out.println(restaurant.name + " is currently closed.");
        }
    }

    protected abstract String getDietaryRestriction();
    protected abstract MealModificationStrategy getModificationStrategy();
}
