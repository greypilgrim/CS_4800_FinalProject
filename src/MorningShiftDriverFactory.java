public class MorningShiftDriverFactory implements DriverFactory {
    @Override
    public Driver createDriver(String name, String address, String county, String shift) {
        return new MorningShiftDriver(name, address, county);
    }
}
