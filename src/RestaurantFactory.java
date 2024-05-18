import java.time.LocalTime;

public interface RestaurantFactory {
    Restaurant createRestaurant(String name, String address, String county, LocalTime openingTime, LocalTime closingTime, String cuisineType);
}
