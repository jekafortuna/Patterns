package patterns.factory_method_pattern.second_variant;

/**
 * Created on 17. November. 16.
 * Factory method pattern realization example
 *
 * @author Evgeniy
 */
public class Runner {
    public static void main(String[] args) {

        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadType.CITY_ROAD);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.OUT_ROAD);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.GRASS_ROAD);
    }
}
