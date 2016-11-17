package patterns.builder_pattern.builder_plain;

/**
 * Created on 17. November. 16.
 * Builder plain variant
 *
 * @author Evgeniy
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildModel("Mersedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();

        System.out.println(car);
    }
}
