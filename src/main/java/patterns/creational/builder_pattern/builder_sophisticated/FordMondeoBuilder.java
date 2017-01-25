package patterns.creational.builder_pattern.builder_sophisticated;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class FordMondeoBuilder extends CarBuilder {

    @Override
    public void buildModel() {
        car.setModel("Ford Mondeo");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
