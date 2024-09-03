public class Solution {
    /**
     * Finds the length of the longest alternating subsequence in the given array.
     * @param nums An array of integers
     * @return The length of the longest alternating subsequence
     */
    public int longestAlternatingSubsequence(int[] nums) {
        // Your implementation here
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int up = 1;
        int down = 1;
        
        for(int i = 1;  i < n; i++) {
                if (nums[i] > nums[i - 1]){
                    up = down + 1;
                } else if (nums[i] < nums[i + 1]) {
                    down = up + 1;
                }
        }
        
        
        int maxLength = 1;
        maxLength = Math.max(maxLength, Math.max(up, down));
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 7, 4, 9, 2, 5};
        System.out.println("An alternating subsequence:"+ solution.longestAlternatingSubsequence(nums1));
        
        int[] nums2 = {1, 5, 4, 3, 2, 6, 7};
        System.out.println("An alternating subsequence:"+ solution.longestAlternatingSubsequence(nums2));
        
    }

    // You can add helper methods if needed
}