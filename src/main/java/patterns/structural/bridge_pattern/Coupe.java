package patterns.structural.bridge_pattern;

/**
 * Created on 8. February. 17.
 *
 * @author Evgeniy
 */
public class Coupe extends Car {
    public Coupe(Model model) {
        super(model);
    }

    @Override
    void showType() {
        System.out.println("Coupe");
    }
}
