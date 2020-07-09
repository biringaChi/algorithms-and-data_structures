package com.data_structures;
import java.util.Stack;

class BinaryTree {
    Tree rootNode;

    public BinaryTree() {
        rootNode = null;
    }

    public void displayPreOrderRecursive(Tree rootNode) {
        // Node, Left, Right
        if (rootNode == null) return;
        System.out.print(rootNode.key + " ");
        displayPreOrderRecursive(rootNode.leftNode);
        displayPreOrderRecursive(rootNode.rightNode);
    }

    public void displayPreOrderIterative(Tree rootNode) {
        // Node, Left, Right
        Tree currentNode = rootNode;
        if(currentNode == null) return;
        Stack<Tree> stack = new Stack<>();
        stack.push(currentNode);
        while(!stack.isEmpty()) {
            currentNode = stack.pop();
            System.out.print(currentNode.key + " ");
           if(currentNode.rightNode != null) stack.push(currentNode.rightNode);
           if(currentNode.leftNode != null) stack.push(currentNode.leftNode);
        }
    }

    public void displayInOrderRecursive(Tree rootNode) {
        // Left, Node, Right
        if(rootNode == null) return;
        displayInOrderRecursive(rootNode.leftNode);
        System.out.print(rootNode.key + " ");
        displayInOrderRecursive(rootNode.rightNode);
    }

    public void displayInOrderIterative(Tree rootNode) {
        // Left, Node, Right
        Tree currentNode = rootNode;
        if(currentNode == null) return;
        Stack<Tree> stack = new Stack<>();
        while(currentNode != null || stack.size() != 0) {
            while(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.leftNode;
            }
            currentNode = stack.pop();
            System.out.print(currentNode.key + " ");
            currentNode = currentNode.rightNode;
        }
    }

    public void displayPostOrderRecursive(Tree rootNode) {
        // Left, Right, Node
        if(rootNode == null) return;
        displayPostOrderRecursive(rootNode.leftNode);
        displayPostOrderRecursive(rootNode.rightNode);
        System.out.print(rootNode.key + " ");
    }

    public void displayPostOrderIterative(Tree rootNode) {
        // Left, Right, Node
        if(rootNode == null) return;
        Tree currentNode = rootNode;
        Stack<Tree> stack = new Stack<>();
        while(currentNode != null || stack.size() != 0) {
            while(currentNode != null) {
                stack.push(currentNode);
                stack.push(currentNode);
                currentNode = currentNode.leftNode;
            }
            if(stack.empty()) return;
            currentNode = stack.pop();
            if(!stack.empty() && stack.peek() == currentNode) currentNode = currentNode.rightNode;
            else {
                System.out.print(currentNode.key + " ");
                currentNode = null;
            }
        }
    }

    public void callDisplayPreOrderRecursive() { displayPreOrderRecursive(rootNode); }
    public void callDisplayPreOrderIterative() { displayPreOrderIterative(rootNode); }

    public void callDisplayInOrderRecursive() { displayInOrderRecursive(rootNode); }
    public void callDisplayInOrderIterative() { displayInOrderIterative(rootNode); }

    public void callDisplayPostOrderRecursive() { displayPostOrderRecursive(rootNode); }
    public void callDisplayPostOrderIterative() { displayPostOrderIterative(rootNode); }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.rootNode = new Tree(2);
        bt.rootNode.leftNode = new Tree(4);
        bt.rootNode.rightNode = new Tree(6);
        bt.rootNode.leftNode.leftNode = new Tree(8);
        bt.rootNode.leftNode.rightNode = new Tree(10);
        bt.rootNode.rightNode.leftNode = new Tree(12);
        bt.rootNode.rightNode.rightNode = new Tree(14);

        System.out.println("PreOrder Recursive traversal: ");
        bt.callDisplayPreOrderRecursive();

        System.out.println("\nPreOrder Iterative traversal: ");
        bt.callDisplayPreOrderIterative();

        System.out.println("\nInOrder Recursive traversal: ");
        bt.callDisplayInOrderRecursive();

        System.out.println("\nInOrder Iterative traversal: ");
        bt.callDisplayInOrderIterative();

        System.out.println("\nPostOrder Recursive traversal: ");
        bt.callDisplayPostOrderRecursive();

        System.out.println("\nPostOrder Iterative traversal: ");
        bt.callDisplayPostOrderIterative();

    }
}