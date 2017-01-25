package patterns.creational.abstract_factory_pattern.second_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing_747();
    }
}
