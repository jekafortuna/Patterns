package patterns.facade_pattern;

/**
 * Created on 21. November. 16.
 * Facade - building pattern realization example
 * Hiding all inside difficult stuff
 *
 * @author Evgeniy
 */
public class FacadeApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
    }
}
