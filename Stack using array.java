class MyStack {
    int top;
    int[] arr = new int[100005];  // array declaration in Java

    MyStack() {
        top = -1; // initialize empty stack
    }

    // Push element x onto stack
    void push(int x) {
        arr[++top] = x; // increment top, then assign
    }

    // Pop element from stack
    int pop() {
        if (top == -1) {
            return -1; // stack empty
        }
        return arr[top--]; // return top element, then decrement
    }
}
