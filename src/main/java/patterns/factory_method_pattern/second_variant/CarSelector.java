package patterns.factory_method_pattern.second_variant;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class CarSelector {

    public Car getCar(RoadType roadType){

        Car car = null;

        switch (roadType){

            case CITY_ROAD:
                car = new Porsche();
                break;

            case OUT_ROAD:
                car = new Geep();
                break;

            case GRASS_ROAD:
                car = new NewGeep();
                break;
        }
        return car;
    }
}
