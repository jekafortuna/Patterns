package patterns.abstract_factory_pattern.second_variant;

/**
 * Created on 21. November. 16.
 * Abstract factory pattern realization example
 *
 * @author Evgeniy
 */
public class Runner {
    private static TransportFactory transportFactory;

    public static void main(String[] args) {
        if (false){
            transportFactory = new UkraineFactory();

            for (int i = 0; i < 5; i++) {
                Aircraft aircraft = transportFactory.createAircraft();
                aircraft.flight();
            }
        }
        else {
            transportFactory = new USAFactory();
        }

        transportFactory.createAircraft();
        transportFactory.createCar();
    }
}
