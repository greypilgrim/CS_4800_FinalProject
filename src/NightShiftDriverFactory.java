public class NightShiftDriverFactory implements DriverFactory {
    @Override
    public Driver createDriver(String name, String address, String county, String shift) {
        return new NightShiftDriver(name, address, county);
    }
}
