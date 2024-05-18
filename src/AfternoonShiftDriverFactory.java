public class AfternoonShiftDriverFactory implements DriverFactory {
    @Override
    public Driver createDriver(String name, String address, String county, String shift) {
        return new AfternoonShiftDriver(name, address, county);
    }
}
