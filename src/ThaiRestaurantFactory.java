import java.time.LocalTime;

public class ThaiRestaurantFactory implements RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, String address, String county, LocalTime openingTime, LocalTime closingTime, String cuisineType) {
        return new ThaiRestaurant(name, address, county, openingTime, closingTime);
    }
}
