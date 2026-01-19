class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int curMax = 0;
        int maxSum = nums[0];

        int curMin = 0;
        int minSum = nums[0];

        for (int x : nums) {
            total += x;

            // curMax = max(x, curMax + x)
            if (curMax + x < x) {
                curMax = x;
            } else {
                curMax = curMax + x;
            }

            // maxSum = max(maxSum, curMax)
            if (curMax > maxSum) {
                maxSum = curMax;
            }

            // curMin = min(x, curMin + x)
            if (curMin + x > x) {
                curMin = x;
            } else {
                curMin = curMin + x;
            }

            // minSum = min(minSum, curMin)
            if (curMin < minSum) {
                minSum = curMin;
            }
        }

        // all negative case
        if (maxSum < 0) return maxSum;

        int circular = total - minSum;

        // return max(maxSum, circular)
        if (circular > maxSum) return circular;
        return maxSum;
    }
}
