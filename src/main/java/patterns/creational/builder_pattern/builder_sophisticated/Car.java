package patterns.creational.builder_pattern.builder_sophisticated;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class Car {

    private String model;
    private Transmission transmission;
    private int maxSpeed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model = '" + model + '\'' +
                ", transmission = " + transmission +
                ", maxSpeed = " + maxSpeed + '}';
    }
}
