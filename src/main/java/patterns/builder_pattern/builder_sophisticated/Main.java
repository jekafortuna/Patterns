package patterns.builder_pattern.builder_sophisticated;

/**
 * Created on 17. November. 16.
 * Builder sophisticated variant
 *
 * @author Evgeniy
 */
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new SubaruBuilder());

        //director.setBuilder(new FordMondeoBuilder());

        Car car = director.BuildCar();

        System.out.println(car);
    }
}
