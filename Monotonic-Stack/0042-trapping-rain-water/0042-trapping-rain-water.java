class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int temp,wat_height,width;
        int min=0;
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty() && height[i]>height[stack.peek()]){
                int bottom = stack.pop();
                if (stack.isEmpty()) break;
                int left = stack.peek();
                wat_height=Math.min(height[i],height[left])-height[bottom];

                width = i - left - 1;
                min += wat_height*width;
            }
            stack.push(i);
        }
        return min;
    }
}