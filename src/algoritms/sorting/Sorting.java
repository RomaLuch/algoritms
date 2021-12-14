package algoritms.sorting;

import java.util.Arrays;


//        пузырьком (Bubble);
//        выбором;
//        слиянием;
//        быстрая сортировка.

public class Sorting {

    private static final int[] array = {4, 1, 7, 5, -1, 10};

    public static void main(String[] args) {
        Selection.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
