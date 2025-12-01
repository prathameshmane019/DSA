public class Stack {
    int top=-1;
    int max=100;
    int[] stack = new int[max];
    // Push an element onto the stack
    public void push(int value) {
        if (top < max - 1) {
            stack[++top] = value;
        } 
        else {
            System.out.println("Stack overflow");
        }
    }
    // Pop an element from the stack
    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } 
        else {
            System.out.println("Stack underflow");
            return -1; // or throw an exception
        }
    }
    // Peek at the top element of the stack
    public int peek() {
        if (top >= 0) {
            return stack[top];
        } 
        else {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println("Top element is: " + stack.peek()); // Should print 20
        System.out.println("Popped element is: " + stack.pop()); // Should print 20
        stack.push(30);
        System.out.println("Top element is: " + stack.peek()); // Should print 30
    }
}



