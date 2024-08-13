import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Sort the candidates array to handle duplicates
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> results) {
        if (target == 0) {
            // If target is reached, add the current combination to results
            results.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates by checking if the current number is the same as the previous one
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // If the current number exceeds the target, no point in exploring further
            if (candidates[i] > target) {
                break;
            }

            // Include the current number and continue exploring
            combination.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, combination, results);

            // Backtrack and remove the current number from the combination
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;
        List<List<Integer>> results1 = solution.combinationSum2(candidates1, target1);
        System.out.println("Example 1 Output: " + results1);

        // Example 2
        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;
        List<List<Integer>> results2 = solution.combinationSum2(candidates2, target2);
        System.out.println("Example 2 Output: " + results2);
    }
}
