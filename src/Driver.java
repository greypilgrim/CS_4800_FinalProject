import java.time.LocalDateTime;

public abstract class Driver {
    protected String name;
    protected String address;
    protected String county;
    protected Order currentOrder;

    public Driver(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.currentOrder = null;
    }

    public void pickUpOrder(Order order) {
        this.currentOrder = order;
        order.setPickupTime(LocalDateTime.now());
        order.notifyOrderPickedUp(order); // Pass the order instance
    }

    public void deliverOrder() {
        if (currentOrder != null) {
            currentOrder.setDeliveryTime(LocalDateTime.now());
            currentOrder.notifyOrderDelivered(currentOrder); // Pass the currentOrder instance
            currentOrder = null;
        }
    }
}
