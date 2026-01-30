class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int[] sums = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++)
            sums[i] = nums[i - 1] + sums[i - 1];

        int maxFirstVal = 0;
        int ans = 0;

        for (int i = firstLen; i <= nums.length - secondLen; i++) {
            maxFirstVal = Math.max(maxFirstVal, sums[i] - sums[i - firstLen]);
            ans = Math.max(ans, (sums[i + secondLen] - sums[i]) + maxFirstVal);
        }

        int maxSecondVal = 0;
        for (int i = secondLen; i <= nums.length - firstLen; i++) {
            maxSecondVal = Math.max(maxSecondVal, sums[i] - sums[i - secondLen]);
            ans = Math.max(ans, (sums[i + firstLen] - sums[i]) + maxSecondVal);
        }

        return ans;
    }
}
