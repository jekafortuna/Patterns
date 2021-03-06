package patterns.behavioral.strategy_pattern.first_variant;

import java.util.Arrays;

/**
 * Created by Evgeniy on 15.11.2016.
 */
public class InsertionSort implements Sorting{
    @Override
    public void sort(int[] array) {
        System.out.println("Inserting sorting");
        System.out.println("Array before sorting: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]){

                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                }
            }
        }
        System.out.println("Array after sorting: " + Arrays.toString(array));
        System.out.println();
    }
}
