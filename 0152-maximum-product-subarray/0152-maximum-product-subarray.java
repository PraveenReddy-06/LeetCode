class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int sufix=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                prefix=1;
            }
            if(nums[n-i-1]==0){
                sufix=1;
            }
            prefix=prefix*nums[i];
            sufix *= nums[n-i-1];

            max=Math.max(max,Math.max(prefix,sufix));
        }
        return max;
    }
}