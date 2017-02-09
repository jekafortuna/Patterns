package patterns.structural.bridge_pattern;

/**
 * Created on 8. February. 17.
 *
 * @author Evgeniy
 */
public class Kia implements Model {
    @Override
    public void setModel() {
        System.out.println("Kia");
    }
}
