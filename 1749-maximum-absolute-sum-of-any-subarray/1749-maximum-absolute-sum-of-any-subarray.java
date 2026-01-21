class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxpos=Integer.MIN_VALUE;
        int maxneg=Integer.MAX_VALUE;
        int pos=0;
        int neg=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            pos += nums[i];
            neg += nums[i];

            if(pos < nums[i]){
                pos=nums[i];
            }
            if(neg > nums[i]){
                neg = nums[i];
            }

            maxpos=Math.max(maxpos,pos);
            maxneg=Math.min(maxneg,neg);

            result=Math.max(maxpos,-maxneg);
        }
        return result;
    }
}