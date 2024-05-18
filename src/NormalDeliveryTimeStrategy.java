import java.time.LocalDateTime;

public class NormalDeliveryTimeStrategy implements DeliveryTimeStrategy {
    @Override
    public LocalDateTime calculateDeliveryTime(Order order) {
        // Assume a constant delivery time of 30 minutes
        return order.getPickupTime().plusMinutes(30);
    }
}
