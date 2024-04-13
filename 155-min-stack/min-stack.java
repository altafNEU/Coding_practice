class MinStack {
    Stack<Integer> s1;
        Stack<Integer> minStack; 
    public MinStack() {
     //   private int min = Integer.MAX_VALUE;   
        s1 = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }
    
    public void pop() {
        
        if(minStack.peek() .equals( s1.peek()))
            minStack.pop();
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */