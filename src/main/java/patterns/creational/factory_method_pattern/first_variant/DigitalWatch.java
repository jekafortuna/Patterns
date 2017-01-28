package patterns.creational.factory_method_pattern.first_variant;

import java.util.Date;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class DigitalWatch implements Watch{

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
