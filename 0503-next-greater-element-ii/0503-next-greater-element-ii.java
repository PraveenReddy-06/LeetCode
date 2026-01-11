class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        int i;
        for(int j=0;j<2*nums.length-1;j++){
            i=j%nums.length;
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                res[stack.pop()]=nums[i];
            }
            if (j < nums.length) { 
                stack.push(i);
            }
        }
        return res;
    }
}