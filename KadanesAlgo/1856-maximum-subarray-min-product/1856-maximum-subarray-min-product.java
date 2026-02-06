class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n= nums.length;
        long MOD = 1000000007L;

        long[] prefix = new long[n+1];
        for(int i=1;i<n+1;i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }

        int[] left= new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            left[i]= stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();

        int[] right = new int[n];
        Arrays.fill(right, n);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>= nums[i]){
                right[stack.pop()]=i;
            }
            stack.push(i);
        }
        long max=0;
        for(int i=0;i<n;i++){
            long x=(prefix[right[i]] - prefix[left[i]+1]) *nums[i];
            max=Math.max(max,x);
        }
        return (int)(max % MOD);
    }
}