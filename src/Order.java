import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order implements OrderObserver{
    private Customer customer;
    private Restaurant restaurant;
    private List<Meal> items;
    private Driver driver;
    private LocalDateTime creationTime;
    private LocalDateTime pickupTime;
    private LocalDateTime deliveryTime;

    public Order(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
        this.driver = null;
        this.creationTime = LocalDateTime.now();
        this.pickupTime = null;
        this.deliveryTime = null;
    }

    public void addItem(Meal item) {
        items.add(item);
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }


    @Override
    public void notifyOrderPlaced(Order order) {
        System.out.println("Order placed by " + order.customer.name + " at " + order.restaurant.name);
        List<Driver> availableDrivers = new ArrayList<>();
        for (Driver driver : CPPFoodDelivery.getInstance().getDrivers()) {
            if (driver.county.equals(order.restaurant.county) && driver.currentOrder == null) {
                availableDrivers.add(driver);
            }
        }
        if (!availableDrivers.isEmpty()) {
            order.driver = availableDrivers.get(0);
            order.driver.pickUpOrder(order);
        } else {
            System.out.println("No available drivers at the moment. Order will be assigned when a driver becomes available.");
        }
    }

    @Override
    public void notifyOrderPickedUp(Order order) {
        System.out.println("Order picked up by " + order.driver.name + " at " + order.pickupTime);
        DeliveryTimeStrategy strategy = new NormalDeliveryTimeStrategy(); // Choose the appropriate strategy
        LocalDateTime expectedDeliveryTime = strategy.calculateDeliveryTime(order);
        System.out.println("Expected delivery time: " + expectedDeliveryTime);
    }

    @Override
    public void notifyOrderDelivered(Order order) {
        System.out.println("Order delivered to " + order.customer.name + " by " + order.driver.name + " at " + order.deliveryTime);
    }
}
