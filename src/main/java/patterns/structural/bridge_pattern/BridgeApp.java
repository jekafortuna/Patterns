package patterns.structural.bridge_pattern;

/**
 * Created on 8. February. 17.
 * Bridge pattern realization example
 *
 * @author Evgeniy
 */
public class BridgeApp {
    public static void main(String[] args) {

        Car car = new Hatchback(new Mercedes());
        car.showDetails();
    }
}
