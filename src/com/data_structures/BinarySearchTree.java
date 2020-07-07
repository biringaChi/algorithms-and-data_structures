package com.data_structures;

public class  BinarySearchTree {
    Tree rootNode;
    private final BinaryTree bt = new BinaryTree();

    public BinarySearchTree() {
        rootNode = null;
    }
    public Tree search(Tree rootNode, int key) {
        if (rootNode == null || rootNode.key == key) return rootNode;
        if (key < rootNode.key) return search(rootNode.leftNode, key);
        return search(rootNode.rightNode, key);
    }

    public Tree insert(Tree rootNode, int key) {
        if (rootNode == null) { rootNode = new Tree(key); return rootNode;}
        if (key < rootNode.key)  rootNode.leftNode = insert(rootNode.leftNode, key);
        else if (key > rootNode.key) rootNode.rightNode = insert(rootNode.rightNode, key);
        return rootNode;
    }
    public void callInsert(int key) { rootNode = insert(rootNode, key); }

    public void callDisplayPreOrder() {
        bt.displayPreOrder(rootNode);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.callInsert(30);
        bst.callInsert(40);
        bst.callInsert(70);
        bst.callInsert(10);
        bst.callInsert(50);
        bst.callInsert(20);
        bst.callInsert(60);

        bst.callDisplayPreOrder();
    }
}
