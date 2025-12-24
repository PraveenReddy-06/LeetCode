class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++) {
            res[i] = res[i-1]*nums[i-1];
        }
        int r=1;
        for(int right=nums.length-1;right>=0;right--) {
            res[right] *= r;
            r *= nums[right];

        }
        return res;
    }
          
}