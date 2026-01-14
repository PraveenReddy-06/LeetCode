class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder arr = new StringBuilder();
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
        
         while (!stack.isEmpty()) {
            arr.append(num.charAt(stack.pop()));
        }
        arr.reverse();
        while (arr.length() > 0 && arr.charAt(0) == '0') {
            arr.deleteCharAt(0);
        }
        return arr.length() == 0 ? "0" : arr.toString();
    }
}