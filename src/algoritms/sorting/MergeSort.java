package algoritms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] arr) {

        if (arr.length < 2) {
            return arr;
        }

        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        int[] sortLeft = sort(left);
        int[] sortRight = sort(right);
        return merge(sortLeft, sortRight);
    }


    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];
        for (int i = 0, r = 0, j = 0; i < left.length || j < right.length; ) {
            if (i >= left.length) {
                result[r++] = right[j++];
                continue;
            }

            if (j >= right.length) {
                result[r++] = left[i++];
                continue;
            }

            if (left[i] >= right[j]) {
                result[r++] = right[j++];
                continue;
            }

            if (left[i] <= right[j]) {
                result[r++] = left[i++];
            }
        }
        return result;
    }

}
