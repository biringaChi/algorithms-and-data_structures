package com.data_structures;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Node Insertion
    public static void insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    // LinkedList display
    public static void displayList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("Linked List: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        insert(list, 5);
        insert(list, 10);
        insert(list, 19);
        displayList(list);
    }
}
