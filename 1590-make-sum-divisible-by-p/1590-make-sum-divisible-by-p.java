class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum=0;
        for(int n:nums){  sum = (sum + n) % p;}
        if(sum%p==0) return 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int target=sum%p;int curr=0;int val;int min=nums.length;
        map.put(0,-1);
        for(int j=0;j<nums.length;j++){
            curr = (curr + nums[j]) % p;

            val=(curr%p-target+ p) % p;
            if(map.containsKey(val)){
                min=Math.min(j-map.get(val),min);
            }
            map.put(curr%p,j);
        }
        if(min==nums.length) return -1;
    return min ;
    }
}