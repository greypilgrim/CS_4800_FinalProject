public class VeganCustomer extends Customer {
    public VeganCustomer(String name, String address, String county) {
        super(name, address, county);
    }

    @Override
    protected String getDietaryRestriction() {
        return "Vegan";
    }

    @Override
    protected MealModificationStrategy getModificationStrategy() {
        return new VeganMealModificationStrategy();
    }
}
