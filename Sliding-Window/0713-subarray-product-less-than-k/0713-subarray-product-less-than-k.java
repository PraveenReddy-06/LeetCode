class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if (k <= 1) return 0;
        
        int j=0;
        int c=0;
        int winpro=1;
        for(int i=0;i<nums.length;i++) {
            winpro = winpro * nums[i];
            while(winpro>=k && j<nums.length) {
                winpro = winpro/nums[j];
                j++;
            }
            c += (i-j + 1);

        }
        return c <0 ? 0:c;
    }
}