public class VeganCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer(String name, String address, String county, String dietaryRestriction) {
        return new VeganCustomer(name, address, county);
    }
}
