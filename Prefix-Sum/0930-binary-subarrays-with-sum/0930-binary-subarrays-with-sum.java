class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int c=0;int s=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(map.containsKey(s-goal)) {
                c+=map.get(s-goal);
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return c;
    }
}