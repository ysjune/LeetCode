package easy;

import java.util.Stack;

public class Implement_Queue_using_Stacks {

    Stack<Integer> stack;
    public Implement_Queue_using_Stacks() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Integer integer = stack.get(0);
        stack.remove(0);
        return integer;
    }

    /** Get the front element. */
    public int peek() {
        return stack.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Implement_Queue_using_Stacks queue = new Implement_Queue_using_Stacks();

        queue.push(1);
        queue.push(2);
        queue.peek();  // returns 1
        queue.pop();   // returns 1
        queue.empty(); // returns false
    }
}
