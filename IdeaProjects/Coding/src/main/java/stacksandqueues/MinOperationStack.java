package stacksandqueues;

import java.util.*;

public class MinOperationStack {

    private Stack<Integer> stack;
    private int minEle;

    public MinOperationStack() {
        stack = new Stack<>();
        minEle = -1;
    }

    public int getMin() {

        if(stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -999;
        }
        return minEle;
    }

    public int peek() {

        if(stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -999;
        }

        int t = stack.peek();
        if(t < minEle) {
            return minEle;
        } else {
            return t;
        }

    }

    public void push(int val) {

        if(stack.isEmpty()) {
            minEle = val;
            stack.push(val);
            return;
        }

        if(val < minEle) {
            this.stack.push(2*val - minEle);
            minEle = val;
        } else {
            this.stack.push(val);
        }
    }

    public int pop() {

        if(stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -999;
        }
        int t = this.stack.pop();

        if(t < minEle) {
            int temp = minEle;
            minEle = 2*minEle - t;
            return temp;
        } else {
            return t;
        }
    }

    public static void main(String[] args) {
        MinOperationStack minStack = new MinOperationStack();
        minStack.push(3);
        minStack.push(5);
        System.out.println(minStack.getMin());
        minStack.push(2);
        minStack.push(1);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.peek());
    }
}
