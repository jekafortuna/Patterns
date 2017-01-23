package patterns.behavioral.strategy_pattern.second_variant;

/**
 * Created on 1. December. 16.
 *
 * @author Evgeniy
 */
public class CantFly implements Flys {
    @Override
    public String Fly() {
        return "I can't fly";
    }
}
