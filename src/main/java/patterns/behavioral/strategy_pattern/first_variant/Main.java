package patterns.behavioral.strategy_pattern.first_variant;

/**
 * Created by Evgeniy on 15.11.2016.
 * Strategy pattern realization example
 */
public class Main {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] array0 = {1, 3, 5, 4, 9, 1};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(array0);

        int[] array1 = {11, 4, 2, 7, 8, 54, 196, -3};
        strategyClient.setStrategy(new InsertionSort());
        strategyClient.executeStrategy(array1);

        int[] array2 = {3, -8, 192, 2, 0, 33, 1, 3, 2};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(array2);
    }
}
