package patterns.creational.factory_method_pattern.second_variant;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class Geep implements Car {

    @Override
    public void drive() {
        System.out.println("Geep's speed 80 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 5 sec");
    }
}
