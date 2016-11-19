package patterns.factory_method_pattern.first_variant;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class DigitalWatchMaker implements WatchMaker{

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}