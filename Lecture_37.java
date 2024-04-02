public class Lecture_37 {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // If no such pair found
        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Indices of the two numbers whose sum is equal to the target:");
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
