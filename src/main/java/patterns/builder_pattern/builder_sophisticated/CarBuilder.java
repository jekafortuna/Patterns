package patterns.builder_pattern.builder_sophisticated;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
abstract class CarBuilder {

    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildModel();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}
