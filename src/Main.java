import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery foodDelivery = CPPFoodDelivery.getInstance();

        // Create restaurants
        RestaurantFactory mexicanRestaurantFactory = new MexicanRestaurantFactory();
        Restaurant tacoJoint = mexicanRestaurantFactory.createRestaurant("Taco Joint", "123 Main St, Irvine, CA 92618", "Orange County",
                LocalTime.of(11, 0), LocalTime.of(21, 0), "Mexican");
        tacoJoint.addMenuItem(new Meal("Beef Tacos", List.of("beef", "tortilla", "lettuce", "cheese"), 30, 40, 20));
        tacoJoint.addMenuItem(new Meal("Chicken Burritos", List.of("chicken", "tortilla", "rice", "beans"), 25, 50, 30));

        Restaurant laMexicana = mexicanRestaurantFactory.createRestaurant("La Mexicana", "456 Beach Blvd, Huntington Beach, CA 92648",
                "Orange County", LocalTime.of(11, 0), LocalTime.of(22, 0), "Mexican");
        laMexicana.addMenuItem(new Meal("Beef Enchiladas", List.of("beef", "tortilla", "enchilada sauce", "cheese"), 35, 45, 25));
        laMexicana.addMenuItem(new Meal("Vegetable Fajitas", List.of("vegetables", "tortilla", "fajita seasoning"), 20, 30, 10));

        RestaurantFactory thaiRestaurantFactory = new ThaiRestaurantFactory();
        Restaurant padThaiPalace = thaiRestaurantFactory.createRestaurant("Pad Thai Palace", "789 Oak Rd, Huntington Beach, CA 92648",
                "Orange County", LocalTime.of(12, 0), LocalTime.of(22, 0), "Thai");
        padThaiPalace.addMenuItem(new Meal("Pad Thai", List.of("rice noodles", "shrimp", "bean sprouts", "peanuts"), 20, 60, 15));
        padThaiPalace.addMenuItem(new Meal("Green Curry", List.of("coconut milk", "chicken", "bamboo shoots", "basil"), 35, 25, 30));

        Restaurant thaiExpress = thaiRestaurantFactory.createRestaurant("Thai Express", "321 Elm St, Irvine, CA 92618",
                "Orange County", LocalTime.of(11, 0), LocalTime.of(21, 0), "Thai");
        thaiExpress.addMenuItem(new Meal("Tom Yum Goong", List.of("shrimp", "lemongrass", "mushrooms", "chili"), 15, 20, 25));
        thaiExpress.addMenuItem(new Meal("Pad See Ew", List.of("rice noodles", "chicken", "broccoli", "soy sauce"), 25, 50, 30));

        foodDelivery.registerRestaurant(tacoJoint);
        foodDelivery.registerRestaurant(laMexicana);
        foodDelivery.registerRestaurant(padThaiPalace);
        foodDelivery.registerRestaurant(thaiExpress);

        // Create customers
        CustomerFactory veganCustomerFactory = new VeganCustomerFactory();
        Customer johnDoe = veganCustomerFactory.createCustomer("John Doe", "789 Park Ave, Irvine, CA 92618", "Orange County", "Vegan");
        Customer janeSmith = veganCustomerFactory.createCustomer("Jane Smith", "321 Ocean Blvd, Huntington Beach, CA 92648", "Orange County", "Vegan");
        Customer bobWilson = veganCustomerFactory.createCustomer("Bob Wilson", "456 Elm St, Irvine, CA 92618", "Orange County", "Vegan");
        Customer aliceJohnson = veganCustomerFactory.createCustomer("Alice Johnson", "789 Oak Rd, Huntington Beach, CA 92648", "Orange County", "Vegan");

        CustomerFactory glutenFreeCustomerFactory = new GlutenFreeCustomerFactory();
        Customer samBrown = glutenFreeCustomerFactory.createCustomer("Sam Brown", "123 Pine St, Irvine, CA 92618", "Orange County", "Gluten-Free");
        Customer emilyDavis = glutenFreeCustomerFactory.createCustomer("Emily Davis", "456 Cedar Rd, Huntington Beach, CA 92648", "Orange County", "Gluten-Free");
        Customer jacobMiller = glutenFreeCustomerFactory.createCustomer("Jacob Miller", "789 Maple Ave, Irvine, CA 92618", "Orange County", "Gluten-Free");
        Customer sophiaWilson = glutenFreeCustomerFactory.createCustomer("Sophia Wilson", "321 Oak Ln, Huntington Beach, CA 92648", "Orange County", "Gluten-Free");

        VeganCustomer michaelJones = new VeganCustomer("Michael Jones", "654 Main St, Irvine, CA 92618", "Orange County");
        GlutenFreeCustomer oliviaThompson = new GlutenFreeCustomer("Olivia Thompson", "987 Beach Blvd, Huntington Beach, CA 92648", "Orange County");
        foodDelivery.registerCustomer(johnDoe);
        foodDelivery.registerCustomer(janeSmith);
        foodDelivery.registerCustomer(bobWilson);
        foodDelivery.registerCustomer(aliceJohnson);
        foodDelivery.registerCustomer(samBrown);
        foodDelivery.registerCustomer(emilyDavis);
        foodDelivery.registerCustomer(jacobMiller);
        foodDelivery.registerCustomer(sophiaWilson);
        foodDelivery.registerCustomer(michaelJones);
        foodDelivery.registerCustomer(oliviaThompson);

        // Create drivers
        DriverFactory morningShiftDriverFactory = new MorningShiftDriverFactory();
        Driver driver1 = morningShiftDriverFactory.createDriver("Driver 1", "456 Elm St, Irvine, CA 92618", "Orange County", "Morning");
        Driver driver2 = morningShiftDriverFactory.createDriver("Driver 2", "789 Oak Rd, Huntington Beach, CA 92648", "Orange County", "Morning");

        DriverFactory afternoonShiftDriverFactory = new AfternoonShiftDriverFactory();
        Driver driver3 = afternoonShiftDriverFactory.createDriver("Driver 3", "123 Pine St, Irvine, CA 92618", "Orange County", "Afternoon");
        Driver driver4 = afternoonShiftDriverFactory.createDriver("Driver 4", "456 Cedar Rd, Huntington Beach, CA 92648", "Orange County", "Afternoon");

        DriverFactory nightShiftDriverFactory = new NightShiftDriverFactory();
        Driver driver5 = nightShiftDriverFactory.createDriver("Driver 5", "789 Maple Ave, Irvine, CA 92618", "Orange County", "Night");
        Driver driver6 = nightShiftDriverFactory.createDriver("Driver 6", "321 Oak Ln, Huntington Beach, CA 92648", "Orange County", "Night");
        Driver driver7 = nightShiftDriverFactory.createDriver("Driver 7", "654 Main St, Irvine, CA 92618", "Orange County", "Night");
        Driver driver8 = nightShiftDriverFactory.createDriver("Driver 8", "987 Beach Blvd, Huntington Beach, CA 92648", "Orange County", "Night");

        foodDelivery.registerDriver(driver1);
        foodDelivery.registerDriver(driver2);
        foodDelivery.registerDriver(driver3);
        foodDelivery.registerDriver(driver4);
        foodDelivery.registerDriver(driver5);
        foodDelivery.registerDriver(driver6);
        foodDelivery.registerDriver(driver7);
        foodDelivery.registerDriver(driver8);

        // Place orders
        johnDoe.placeOrder(tacoJoint, List.of(1), List.of()); // Chicken Burritos without toppings
        janeSmith.placeOrder(padThaiPalace, List.of(0), List.of("extra peanuts")); // Pad Thai with extra peanuts
        bobWilson.placeOrder(laMexicana, List.of(1), List.of("extra vegetables")); // Vegetable Fajitas with extra vegetables
        aliceJohnson.placeOrder(thaiExpress, List.of(0), List.of()); // Tom Yum Goong without toppings

        samBrown.placeOrder(tacoJoint, List.of(0), List.of("extra lettuce")); // Beef Tacos with extra lettuce
        emilyDavis.placeOrder(padThaiPalace, List.of(1), List.of()); // Green Curry without toppings
        jacobMiller.placeOrder(laMexicana, List.of(0), List.of("no cheese")); // Beef Enchiladas without cheese
        sophiaWilson.placeOrder(thaiExpress, List.of(1), List.of("extra broccoli")); // Pad See Ew with extra broccoli

        michaelJones.placeOrder(tacoJoint, List.of(0, 1), List.of("extra cheese", "extra rice")); // Beef Tacos with extra cheese, Chicken Burritos with extra rice
        oliviaThompson.placeOrder(padThaiPalace, List.of(0, 1), List.of("no peanuts", "extra vegetables")); // Pad Thai without peanuts, Green Curry with extra vegetables
    }
}