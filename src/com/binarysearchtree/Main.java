package com.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree!");
        new Main().arrangingNumbersInBinaryTreeAsShownInFigure();
    }

    public void arrangingNumbersInBinaryTreeAsShownInFigure() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        System.out.println("\nMyBinaryTree : " + myBinaryTree);
        System.out.println("\nSize of Binary Tree : " + size);
    }
}