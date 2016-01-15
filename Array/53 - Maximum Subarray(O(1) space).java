/**
 * Maximum Subarray
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 *
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */
 public class Solution {
    public int maxSubArray(int[] nums) {

        // corner case
        if ((nums == null) || (nums.length == 0)) {
            return 0;
        }

        int max = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if ((currentSum + nums[i]) > nums[i]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }

            if (currentSum > max) {
                max = currentSum;
            }
        }

        return max;


    }
}