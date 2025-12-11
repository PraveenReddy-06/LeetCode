class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxleft,maxright,left,right,sum;
        maxleft=height[0];
        maxright=height[n-1];
        left=0;
        right=n-1;
        sum=0;
        while(left<right) {
            
            if(maxleft<=maxright) {
                if(maxleft-height[left]>0)
                    {sum += maxleft-height[left];}

                if(maxleft<height[left]) {
                    maxleft=height[left];
                }
                left++;
            }
            else if(maxleft>maxright){
                if(maxright-height[right]>0)
                    {sum+= maxright-height[right];}
                
                if(maxright<height[right]) {
                    maxright=height[right];
                }
                right--;
            }

            
        }
        return sum;
    }
}