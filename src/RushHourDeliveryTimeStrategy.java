import java.time.LocalDateTime;
import java.time.LocalTime;

public class RushHourDeliveryTimeStrategy implements DeliveryTimeStrategy {
    @Override
    public LocalDateTime calculateDeliveryTime(Order order) {
        // Assume rush hour from 4 PM to 7 PM, with an additional 30 minutes
        LocalTime pickupTime = order.getPickupTime().toLocalTime();
        if (pickupTime.isAfter(LocalTime.of(16, 0)) && pickupTime.isBefore(LocalTime.of(19, 0))) {
            return order.getPickupTime().plusHours(1);
        } else {
            return order.getPickupTime().plusMinutes(30);
        }
    }
}
