class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> prefixStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        prefixStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.addFirst(val);
        if (prefixStack.isEmpty()) {
            prefixStack.addFirst(val);
            return;
        }
        int smallerVal = Math.min(prefixStack.getFirst(), val);
        prefixStack.addFirst(smallerVal);
    }
    
    public void pop() {
        stack.removeFirst();
        prefixStack.removeFirst();
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
        return prefixStack.getFirst();
    }
}
