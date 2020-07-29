package easy;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<Integer> list = new ArrayList<>();
    public MinStack() {

    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }


    /**
     *
     *Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     *
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     *
     *
     * Example 1:
     * Input
     * ["MinStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     *
     * Output
     * [null,null,null,null,-3,null,0,-2]
     *
     * Explanation
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.getMin(); // return -3
     * minStack.pop();
     * minStack.top();    // return 0
     * minStack.getMin(); // return -2
     *
     *
     * Constraints:
     * Methods pop, top and getMin operations will always be called on non-empty stacks.
     *
     */
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin()); // -3
        obj.pop();
        System.out.println(obj.top()); // 0
        System.out.println(obj.getMin()); // -2
    }
}
