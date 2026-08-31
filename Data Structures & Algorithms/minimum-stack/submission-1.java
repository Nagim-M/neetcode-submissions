class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> prefixStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        prefixStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (prefixStack.isEmpty()) {
            prefixStack.push(val);
            return;
        }
        int smallerVal = Math.min(prefixStack.peek(), val);
        prefixStack.push(smallerVal);
    }
    
    public void pop() {
        stack.pop();
        prefixStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return prefixStack.peek();
    }
}
