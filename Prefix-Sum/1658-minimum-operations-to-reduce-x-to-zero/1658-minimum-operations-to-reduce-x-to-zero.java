class Solution {
    public int minOperations(int[] nums, int x) {
        int[] prefix = new int[nums.length+1];
        for(int i=1;i<nums.length+1;i++) {
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        int sum=prefix[nums.length]-x;
        if (sum < 0) return -1;  
        int left=0;
        int maxLen = -1;
        for(int right=0;right<prefix.length;right++){
            while(prefix[right]-prefix[left]>sum){
                left++;
            }
            if(prefix[right]-prefix[left]==sum){
                maxLen = Math.max(maxLen, right - left);
            }
        }
       return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}