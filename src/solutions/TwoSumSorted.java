package solutions;

/**
 * Given a 1-indexed array of integers numbers that is already sorted
 * in non-decreasing order, find two numbers such that they add up to a
 * specific target number. Let these two numbers be numbers[index1] and
 * numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one
 * as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution.
 * You may not use the same element twice.
 * <p>
 * Example 1:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * <p>
 * Example 2:
 * <p>
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 */
public class TwoSumSorted {

    public static int[] twoSum2InputArrayIsSorted(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (numbers[i] + numbers[j] == target) {
                        if (i > j) {
                            i = i + j;
                            j = i - j;
                            i = i - j;
                        }
                        return new int[]{++i, ++j};
                    }
                }
            }
        }
        return null;
    }
}
