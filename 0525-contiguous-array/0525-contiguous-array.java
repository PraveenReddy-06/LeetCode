class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            nums[i]= nums[i]==0 ? -1:1;

            sum += nums[i];
            if(map.containsKey(sum)){
                max=Math.max(i-map.get(sum),max);
            }
            else {
                map.put(sum,i);
            }
        }   
        return max;
    }
}