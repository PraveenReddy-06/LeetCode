class Solution {
    public int maxSubArray(int[] nums) {
        int prefix = 0;
        int minPrefix = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int x : nums) {
            prefix += x;
            maxSum = Math.max(maxSum, prefix - minPrefix);
            minPrefix = Math.min(minPrefix, prefix);
        }
        return maxSum;
    }
}
