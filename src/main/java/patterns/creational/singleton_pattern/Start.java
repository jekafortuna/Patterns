package patterns.creational.singleton_pattern;

/**
 * Created on 21. November. 16.
 * Singleton pattern realization example
 *
 * @author Evgeniy
 */
public class Start {
    public static void main(String[] args) {
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();

        Singleton.getInstance().stop();
    }
}
