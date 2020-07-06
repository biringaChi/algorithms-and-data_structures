package com.data_structures;

// FIFO

public class Queue {
    int[] queue = new int[5];
    int size = 0, front = 0, rear = 0;

    public void enqueue(int data) {
        if(!max()) {
            queue[rear] = data;
            rear = (rear + 1)%5;
            size++;
        } else System.out.println("You can't add " + data + ". Your queue is full");
    }

    public void dequeue() {
        if(!isEmpty()) {
            front = (front + 1)%5;
            size--;
        } else System.out.println("You queue is empty");
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean max() {
        return size() == 5;
    }

    public void displayQueue() {
        for (int i = 0;  i < size; i++) {
            System.out.println(queue[(front + i)%5]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.displayQueue();
    }
}
