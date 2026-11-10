// first try
class MinStack {

    private Deque<Integer> stack;

    public MinStack() {
        this.stack = new ArrayDeque<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (Integer i: stack) {
            min = Math.min(min, i);
        }
        return min;
    }
}
