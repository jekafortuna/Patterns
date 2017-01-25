package patterns.creational.builder_pattern.builder_sophisticated;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class SubaruBuilder extends CarBuilder {

    @Override
    public void buildModel() {
        car.setModel("Subaru");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission(Transmission.MECHANICAL);
    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
