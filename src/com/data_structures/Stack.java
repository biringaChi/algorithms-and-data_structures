package com.data_structures;
// LIFO

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if(top == 5) System.out.println("Can't push " + data + ". Your Stack is full");
        else {
            stack[top] = data;
            top++;
        }
    }
    public int pop() {
        int top_data = 0;
        if(isEmpty()) System.out.println("Your Stack is empty");
        else {
            top--;
            top_data = stack[top];
            stack[top] = 0;
        }
        return top_data;
    }
    public int peek() {
        return stack[top-1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void displayStack() {
        for (int value : stack) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.displayStack();
    }
}