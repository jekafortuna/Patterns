package patterns.builder_pattern.builder_plain;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class CarBuilder {

    // Default values
    private String mod = "Car";
    private Transmission tran = Transmission.MECHANICAL;
    private int sp = 120;

    CarBuilder buildModel(String mod){
        this.mod = mod;
        return this;
    }

    CarBuilder buildTransmission(Transmission tran){
        this.tran = tran;
        return this;
    }

    CarBuilder buildMaxSpeed(int sp){
        this.sp = sp;
        return this;
    }

    Car build(){

        Car car = new Car();
        car.setModel(mod);
        car.setTransmission(tran);
        car.setMaxSpeed(sp);
        return car;

    }
}
