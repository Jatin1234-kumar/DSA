class StockSpanner {
    Stack<Integer> stack=new Stack<>();
    ArrayList<Integer> prices=new ArrayList<>();
    int index;

    public StockSpanner() {
        index = -1;
    }
    
    public int next(int price) {
        index++;
        prices.add(price);
        while(!stack.isEmpty() &&  prices.get(stack.peek()) <= price){
            stack.pop();
        }
        int span;
        if (stack.isEmpty()) {
            span = index + 1;
        } else {
            span = index - stack.peek();
        }
        stack.push(index);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */