import java.util.ArrayList;
import java.util.List;
public class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private List<Restaurant> restaurants;
    private List<Customer> customers;
    private List<Driver> drivers;
    private List<Order> orders;

    // Singleton
    private CPPFoodDelivery() {
        restaurants = new ArrayList<>();
        customers = new ArrayList<>();
        drivers = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public static CPPFoodDelivery getInstance() {
        if (instance == null) {
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public void registerRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public void placeOrder(Order order) {
        orders.add(order);
        order.notifyOrderPlaced(order); // Pass the order instance
    }

    public List<Driver> getDrivers() {
        return drivers;
    }
}
