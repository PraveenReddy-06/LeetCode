class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        String arr="";
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty() && num.charAt(stack.peek()) > num.charAt(i) && k>0){
                stack.pop();
                k--;
            }
            stack.push(i);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        int i=0;
        while(!stack.isEmpty()){
            arr = num.charAt(stack.pop())+ arr;
        }
        arr = arr.replaceFirst("^0+","");
        if(arr.length() == 0) return "0";
        return arr;
    }
}