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

    public int minValue(Tree rootNode) {
        int minimum_value = rootNode.key;
        while (rootNode.leftNode != null) {
            minimum_value = rootNode.leftNode.key;
            rootNode = rootNode.leftNode;
        }
        return minimum_value;
    }

    public Tree delete(Tree rootNode, int key) {
        if (rootNode == null)  return rootNode;
        if (key < rootNode.key) rootNode.leftNode = delete(rootNode.leftNode, key);
        else if (key > rootNode.key) rootNode.rightNode = delete(rootNode.rightNode, key);
        else {
            if (rootNode.leftNode == null) return rootNode.rightNode;
            else if (rootNode.rightNode == null) return rootNode.leftNode;
            rootNode.key = minValue(rootNode.rightNode);
            rootNode.rightNode = delete(rootNode.rightNode, rootNode.key);
        }
        return rootNode;
    }
    public void callInsert(int key) { rootNode = insert(rootNode, key); }
    public void callDelete(int key) { rootNode = delete(rootNode, key); }

    public void callDisplayPreOrderRecursive() {
        bt.displayPreOrderRecursive(rootNode);
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
        bst.callDelete(60);
        bst.callDisplayPreOrderRecursive();
    }
}
