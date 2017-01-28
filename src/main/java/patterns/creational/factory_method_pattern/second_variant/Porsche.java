package patterns.creational.factory_method_pattern.second_variant;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Porsche's speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 2 sec");
    }
}
