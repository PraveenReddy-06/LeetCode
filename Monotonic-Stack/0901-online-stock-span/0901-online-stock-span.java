class StockSpanner {
    Stack<int[]> stack = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
            int k=0;
            while(!stack.isEmpty() && stack.peek()[0]<=price){
                k+= stack.peek()[1];
                stack.pop();
            }
             stack.push(new int[]{price,k+1});

        return k+1;
        }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */