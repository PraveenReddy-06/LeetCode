class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int left=0;
        int c=k;
        for(int right=0;right<nums.length;right++) {
            if(nums[right]==0) {
                c--;
            }
            while(c<0) {
                if(nums[left]==0) {
                    c++;
                    }
                    left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}