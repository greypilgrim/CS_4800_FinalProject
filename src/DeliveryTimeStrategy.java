import java.time.LocalDateTime;

public interface DeliveryTimeStrategy {
    LocalDateTime calculateDeliveryTime(Order order);
}
