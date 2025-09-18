package test.java.com.interview.twosum;

import org.junit.jupiter.api.Test;

import main.java.com.interview.twosum.TwoSum;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    TwoSum solver = new TwoSum();

    @Test
    public void testBruteForce() {
        int[] result = solver.twoSumBruteForce(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testHashMap() {
        int[] result = solver.twoSumHashMap(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testNoSolution() {
        int[] result = solver.twoSumHashMap(new int[]{1, 2, 3}, 10);
        assertArrayEquals(new int[]{}, result);
    }
}