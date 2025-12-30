class Solution {
    public int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length+1];

        for(int i=1;i<=nums.length;i++) {
            sum[i] += sum[i-1]+ nums[i-1];
        }
        for(int j=0;j<nums.length;j++) {
            if(sum[j]==sum[sum.length-1]-sum[j+1]){
                return j;
            }
        }
        return -1;
    }
}