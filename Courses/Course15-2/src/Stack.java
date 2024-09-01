/**
 * Stack
 */
public class Stack {
    private int[] stack;
    private int top;
    private int size;
    private int capacity;
    
    // Constructor to initialize the stack
    public Stack(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int element) throws StackOverflowException {
        if(isFull()){
            throw new StackOverflowException("Stack is full");
        }
        top++;
        stack[top] = element;

    }
    
    public int pop() throws StackUnderflowException{
        if(isFull()){
            throw new StackUnderflowException(null);
        }
        int poppedElement = stack[top];
        top--;
        return poppedElement;
    }

    public int peek() throws StackUnderflowException {
        if(isEmpty()){
            throw new StackUnderflowException("Stack is empty");
        }
        return stack[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
}