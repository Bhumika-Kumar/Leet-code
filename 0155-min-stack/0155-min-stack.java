class MinStack {
    Stack<Integer> stack;
    Stack <Integer> MinStack;
    public MinStack() {
        stack=new Stack<Integer>();
        MinStack=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(MinStack.isEmpty()){
            stack.push(val);
            MinStack.push(val);
        }else{
            stack.push(val);
            MinStack.push(Math.min(val,MinStack.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        MinStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */