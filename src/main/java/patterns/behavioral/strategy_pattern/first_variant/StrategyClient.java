package patterns.behavioral.strategy_pattern.first_variant;

/**
 * Created by Evgeniy on 15.11.2016.
 * Context
 */
public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] array){
        strategy.sort(array);
    }
}
