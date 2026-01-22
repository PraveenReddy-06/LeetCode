class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int f=firstLen;
        int s=secondLen;

        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }

        int i=0;
        int m1=0;int m2=0;
        int ans=0;
        for(int j=f; j<=nums.length-f; j++){
            m1=Math.max(m1, nums[j]-nums[j-f]);
            if(j+s<nums.length)
                ans=Math.max(ans,nums[j+s]-nums[j]+m1);
        }
        for(int k=s ; k<=nums.length-s; k++){
            m2=Math.max(m2,nums[k]-nums[k-s]);
            if(k+f<nums.length)
                 ans=Math.max(ans,nums[k+f]-nums[k]+m2);
        }

        return ans;
    }
}