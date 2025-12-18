class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s=0;
        int gs=0;
        int max=0;
        for(int i=0;i<minutes;i++) {
            if(grumpy[i]==0) s+=customers[i];
            else {
                gs+=customers[i];
            }
        }
        max=gs;
        for(int right=minutes; right<customers.length; right++) {
            if(grumpy[right]==0) {
                s+=customers[right];
            }
            else if(grumpy[right]==1) {
                gs+=customers[right];
            }
            if(grumpy[right-minutes]==1) {
                gs=gs-customers[right-minutes];
            }
            max=Math.max(max,gs);
        }
        return max+s;
    }
}