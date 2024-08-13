import java.util.HashMap;
import java.util.Map;

public class Solution {

    // Method to find two numbers that add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the complement and current number
                return new int[] { numMap.get(complement), i };
            }

            // Otherwise, add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // Since the problem guarantees a solution exists, we won't reach this line
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test cases
        int[] result1 = solution.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 1]

        int[] result2 = solution.twoSum(new int[] {3, 2, 4}, 6);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 2]

        int[] result3 = solution.twoSum(new int[] {3, 3}, 6);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); // Output: [0, 1]
    }
}
