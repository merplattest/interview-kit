package com.interview.twosum;

import org.junit.jupiter.api.Test;

import main.java.com.interview.twosum.TwoSum;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    TwoSum solver = new TwoSum();

    @Test
    public void testValidInput() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solver.twoSumProb(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = solver.twoSumProb(nums, target);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    public void testNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        assertThrows(IllegalArgumentException.class, () -> solver.twoSumProb(nums, target));
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> solver.twoSumProb(null, 5));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> solver.twoSumProb(nums, 5));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {5};
        assertThrows(IllegalArgumentException.class, () -> solver.twoSumProb(nums, 5));
    }

    @Test
    public void testDuplicateValues() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solver.twoSumProb(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}