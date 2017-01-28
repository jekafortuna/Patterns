package patterns.creational.factory_method_pattern.first_variant;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class RomeWatchMaker implements WatchMaker{

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
