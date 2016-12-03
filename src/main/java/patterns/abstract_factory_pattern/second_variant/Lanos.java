package patterns.abstract_factory_pattern.second_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Lanos implements Car {

    @Override
    public void drive() {
        System.out.println("Lanos is moving");
    }

    @Override
    public void stop() {
        System.out.println("Lanos is stopped");
    }
}
