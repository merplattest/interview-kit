package main.java.com.interview.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Two Sum
 *
 * Given an array of integers `nums` and an integer `target`, return the indices of the two numbers
 * such that they add up to the target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]  // Because nums[0] + nums[1] == 9
 *
 * Expected Solutions:
 * - Brute-force approach with nested loops (O(n^2) time)
 * - Optimized approach using a HashMap to store complements (O(n) time)
 */

public class TwoSum {
      // Brute-force solution: O(n^2)
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // HashMap solution: O(n)
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
