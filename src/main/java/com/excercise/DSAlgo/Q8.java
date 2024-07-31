package com.excercise.DSAlgo;

import java.util.Stack;

public class Q8 {

    public static void main(String[] args) {

        MinStack minStack = new MinStack(10);

        minStack.push(5);
        minStack.push(34);
        System.out.println("Popped element: " + minStack.pop());
        minStack.push(15);
        minStack.push(17);
        minStack.push(3);
        minStack.push(50);
        minStack.push(47);
        minStack.push(57);
        System.out.println("Popped element: " + minStack.pop());
        minStack.push(91);
        minStack.push(100);

        System.out.println("Minimum element: " + minStack.min());
    }
}

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int maxSize;

    //constructor
    public MinStack(int maxSize) {
        this.maxSize = maxSize;
    }

    //removes and returns value from stack
    public Integer pop() {

        // return statement with your code
        minStack.pop();
        return stack.pop();

    }

    //pushes value into the stack
    public void push(Integer value) {

        // return statement with your code
        if (stack.isEmpty()) {
            stack.push(value);
            minStack.push(value);
        } else {
            stack.push(value);
            int min = Math.min(value, minStack.peek());
            minStack.push(min);
        }

    }

    //returns minimum value in O(1)
    public int min() {

        // return statement with your code
        return minStack.peek();
    }
} 