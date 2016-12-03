package patterns.abstract_factory_pattern.second_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Boeing_747 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("Boeing 747 is flying");
    }
}
