import java.time.LocalTime;

public class MexicanRestaurantFactory implements RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, String address, String county, LocalTime openingTime, LocalTime closingTime, String cuisineType) {
        return new MexicanRestaurant(name, address, county, openingTime, closingTime);
    }
}
