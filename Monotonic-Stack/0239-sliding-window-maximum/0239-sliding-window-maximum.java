class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int res[] = new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[i]> nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                res[i-k+1]=nums[deque.peekFirst()];
            }
        }
    return res;
    }
}