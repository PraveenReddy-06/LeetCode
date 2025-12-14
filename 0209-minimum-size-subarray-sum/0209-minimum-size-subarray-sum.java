class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min=Integer.MAX_VALUE;
        int j=0;
        int winsum=0;
        for(int i=0;i<nums.length;i++) {
            while(winsum<target && j<nums.length){
                winsum = winsum + nums[j];
                j++;
            }
            if (winsum >= target) {
                min = Math.min(min, j - i);
            }
            winsum = winsum - nums[i];
        }
         return min == Integer.MAX_VALUE ? 0 : min;
    }
}