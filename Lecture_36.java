public class Lecture_36 {
    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Calculate sum of first window of size k
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        maxSum = Math.max(maxSum, currentSum);

        // Move the window by one element at a time and update the sums
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int maxSum = maxSumSubarray(nums, k);
        System.out.println("Maximum sum of a subarray of size " + k + ": " + maxSum);
    }   
}