package algoritms.sorting;

import java.util.Arrays;


//        пузырьком (Bubble);
//        выбором;
//        слиянием;
//        быстрая сортировка.

public class Sorting {

    private static final int[] array = {-10, 4, 1, 7, 5, 100, -1,  10, -100};

    public static void main(String[] args) {

        int[] sort = MergeSort.sort(array);
        System.out.println(Arrays.toString(sort));
    }
}
