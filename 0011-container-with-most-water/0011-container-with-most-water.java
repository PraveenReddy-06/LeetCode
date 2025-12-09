class Solution {
    public int maxArea(int[] height) {
        int left,right,i,max,area;
        left=0; right=height.length-1; i=0; max=0;

        while(left<right) {
            area=(right-left)*(Math.min(height[left],height[right]));
            if(max<area) {
                max=area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return max;
    }
}