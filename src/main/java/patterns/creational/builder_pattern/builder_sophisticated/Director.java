package patterns.creational.builder_pattern.builder_sophisticated;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class Director {

    private CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car BuildCar(){

        builder.createCar();
        builder.buildModel();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        Car car = builder.getCar();
        return car;
    }
}
