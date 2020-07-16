package com.problems;

public class ReverseLinkedList {
    public static Node nodeHead;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node reverse(Node nodeHead) {
        Node previousNode = null;
        Node currentNode = nodeHead;
        Node nextNode = nodeHead;
        while(nextNode != null) {
            nextNode = nextNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        nodeHead = previousNode;
        return nodeHead;
    }

    public static void displayLinkedList(Node nodeHead) {
        while (nodeHead != null) {
            System.out.print(nodeHead.data + " ");
            nodeHead = nodeHead.next;
        }
    }

    public static void main(String[] args) {
        nodeHead = new Node(1);
        nodeHead.next = new Node(2);
        nodeHead.next.next = new Node(3);
        nodeHead.next.next.next = new Node(4);
        nodeHead.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        displayLinkedList(nodeHead);
        nodeHead = reverse(nodeHead);
        System.out.println("\nReversed Linked List:");
        displayLinkedList(nodeHead);
    }
}
