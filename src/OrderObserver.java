public interface OrderObserver {
    void notifyOrderPlaced(Order order);
    void notifyOrderPickedUp(Order order);
    void notifyOrderDelivered(Order order);
}
