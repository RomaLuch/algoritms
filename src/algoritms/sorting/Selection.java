package algoritms.sorting;

public class Selection {
    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int min = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }
            array[i] = min;
        }
    }
}
