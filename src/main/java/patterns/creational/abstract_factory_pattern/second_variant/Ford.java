package patterns.creational.abstract_factory_pattern.second_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Ford implements Car {

    @Override
    public void drive() {
        System.out.println("Ford is moving");
    }

    @Override
    public void stop() {
        System.out.println("Ford is stopped");
    }
}
