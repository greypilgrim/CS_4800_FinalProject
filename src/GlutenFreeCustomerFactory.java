public class GlutenFreeCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer(String name, String address, String county, String dietaryRestriction) {
        return new GlutenFreeCustomer(name, address, county);
    }
}
