package patterns.factory_method_pattern.first_variant;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class RomeWatch implements Watch{

    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}
