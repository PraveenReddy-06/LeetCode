class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] res=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
             while(!stack.isEmpty() && temperatures[i] >= stack.peek()[0]){
                stack.pop();
             }
             if(!stack.isEmpty())
             { res[i]=stack.peek()[1]-i;}
            else{
                res[i]=0;
            }
            stack.push(new int[]{temperatures[i],i});
        }
        
        return res;
    }
}