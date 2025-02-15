import java.util.Stack;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(val);
            min.push(val);
        } else {
            st.push(val);
            if (val < min.peek()) 
                min.push(val);
            else 
                min.push(min.peek());
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(8);
        minStack.push(1);
        
        System.out.println("Minimum Element: " + minStack.getMin()); // Output: 1
        minStack.pop();
        System.out.println("Top Element: " + minStack.top()); // Output: 8
        System.out.println("Minimum Element: " + minStack.getMin()); // Output: 2
    }
}
