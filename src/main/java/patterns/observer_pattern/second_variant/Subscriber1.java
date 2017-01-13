package patterns.observer_pattern.second_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Subscriber1 implements PublisherActionListener {

    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
