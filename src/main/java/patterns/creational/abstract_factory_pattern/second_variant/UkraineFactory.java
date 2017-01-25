package patterns.creational.abstract_factory_pattern.second_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class UkraineFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Lanos();
    }

    @Override
    public Aircraft createAircraft() {
        return new AN_225();
    }
}
