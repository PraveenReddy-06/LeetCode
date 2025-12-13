class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winsum=0;
        for(int i=0;i<k;i++) {
            winsum += nums[i];
        }
        double max=winsum;

        for(int i=k;i<nums.length;i++) {
            winsum = winsum + nums[i]- nums[i-(k)];
            if(winsum>max) {
                max=winsum;
            }
        }
        return max/k;
    }
}