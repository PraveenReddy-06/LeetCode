class Solution {
    public int maxProduct(int[] nums) {
        int l=0,r=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=l){
                r=l;
                l=nums[i];
            }
        }
        return (l-1)*(r-1);
    }
}