class MinStack {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public MinStack() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int val) {
        stack1.push(val);
        if (stack2.isEmpty()) {
            stack2.push(val);
        } else {
            stack2.push(Math.min(val, stack2.peek()));
        }
    }

    public void pop() {
        if (!stack1.isEmpty()) {
            stack1.pop();
            stack2.pop();  
        }
    }

    public int top() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }
        throw new NoSuchElementException("Stack is empty");
    }

    public int getMin() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        throw new NoSuchElementException("Stack is empty");
    }
}
