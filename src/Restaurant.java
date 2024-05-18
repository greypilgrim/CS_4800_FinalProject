import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

abstract public class Restaurant {
    protected String name;
    protected String address;
    protected String county;
    protected LocalTime openingTime;
    protected LocalTime closingTime;
    protected List<Meal> menu;

    public Restaurant(String name, String address, String county, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.menu = new ArrayList<>();
    }

    public void addMenuItem(Meal menuItem) {
        menu.add(menuItem);
    }

    public boolean isOpen(LocalDateTime currentTime) {
        LocalTime currentTimeOfDay = currentTime.toLocalTime();
        return currentTimeOfDay.isAfter(openingTime) && currentTimeOfDay.isBefore(closingTime);
    }
}
