package patterns.structural.bridge_pattern;

/**
 * Created on 8. February. 17.
 *
 * @author Evgeniy
 */
public class Skoda implements Model {
    @Override
    public void setModel() {
        System.out.println("Skoda");
    }
}
