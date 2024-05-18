public class GlutenFreeCustomer extends Customer {
    public GlutenFreeCustomer(String name, String address, String county) {
        super(name, address, county);
    }

    @Override
    protected String getDietaryRestriction() {
        return "Gluten-Free";
    }

    @Override
    protected MealModificationStrategy getModificationStrategy() {
        return new GlutenFreeMealModificationStrategy();
    }
}
