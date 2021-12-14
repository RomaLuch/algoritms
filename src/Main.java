import solutions.TwoSumSorted;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int target = 6;
//        int[] twoSum1 = new solutions.Solutions().twoSum1(nums, target);
        int[] twoSum2 = TwoSumSorted.twoSum2InputArrayIsSorted(nums, target);
//        System.out.println(Arrays.toString(twoSum1));
        System.out.println(Arrays.toString(twoSum2));
    }
}
