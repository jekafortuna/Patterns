package patterns.behavioral.strategy_pattern.first_variant;

import java.util.Arrays;

/**
 * Created by Evgeniy on 15.11.2016.
 */
public class BubbleSort implements Sorting{
    @Override
    public void sort(int[] array) {
        System.out.println("Bubble sorting");
        System.out.println("Array before sorting: " + Arrays.toString(array));

        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
