package patterns.creational.abstract_factory_pattern.second_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public interface TransportFactory {
    public Car createCar();
    public Aircraft createAircraft();
}
