package patterns.strategy_pattern;

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
