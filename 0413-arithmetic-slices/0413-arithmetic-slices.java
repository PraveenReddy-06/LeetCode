class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int ans=0;
        int i=0;
        while(i<nums.length-2){
            int diff = nums[i+1]-nums[i];
            int j=i+2;
            while(j<nums.length && nums[j]-nums[j-1]==diff){
                j++;
            }
            int len = j-i;

            if(len>=3){
                ans += (len-1)*(len-2)/2; 
            }
            i=j-1;
        }
        return ans;
    }
}