import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testCase1() {
        int[] nums = {1, 7, 4, 9, 2, 5};
        assertEquals(6, solution.longestAlternatingSubsequence(nums));
    }

    @Test
    void testCase2() {
        int[] nums = {1, 5, 4, 3, 2, 6, 7};
        assertEquals(3, solution.longestAlternatingSubsequence(nums));
    }

    // Add more test cases here
}