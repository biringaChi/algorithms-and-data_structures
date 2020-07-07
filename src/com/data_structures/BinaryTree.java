package com.data_structures;

class BinaryTree {
    Tree rootNode;

    public BinaryTree() {
        rootNode = null;
    }

    public void displayPreOrder(Tree rootNode) {
        if (rootNode == null) return;
        System.out.print(rootNode.key + " ");
        displayPreOrder(rootNode.leftNode);
        displayPreOrder(rootNode.rightNode);
    }

    public void displayInOrder(Tree rootNode) {
        if(rootNode == null) return;
        displayInOrder(rootNode.leftNode);
        System.out.print(rootNode.key + " ");
        displayInOrder(rootNode.rightNode);
    }

    public void displayPostOrder(Tree rootNode) {
        if(rootNode == null) return;
        displayPostOrder(rootNode.leftNode);
        displayPostOrder(rootNode.rightNode);
        System.out.print(rootNode.key + " ");
    }

    public void callDisplayPreOrder() {
        displayPreOrder(rootNode);
    }

    public void callDisplayInOrder() {
        displayInOrder(rootNode);
    }

    public void callDisplayPostOrder() {
        displayPostOrder(rootNode);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.rootNode = new Tree(2);
        bt.rootNode.leftNode = new Tree(4);
        bt.rootNode.rightNode = new Tree(6);
        bt.rootNode.leftNode.leftNode = new Tree(8);
        bt.rootNode.leftNode.rightNode = new Tree(10);
        bt.rootNode.rightNode.leftNode = new Tree(12);
        bt.rootNode.rightNode.rightNode = new Tree(14);

        System.out.println("PreOrder traversal: ");
        bt.callDisplayPreOrder();

        System.out.println("\nInOrder traversal: ");
        bt.callDisplayInOrder();

        System.out.println("\nPostOrder traversal: ");
        bt.callDisplayPostOrder();

    }
}

