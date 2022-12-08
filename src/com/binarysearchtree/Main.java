package com.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree!");
        new Main().given3NumbersArrageInBinaryForm();
    }

    public void given3NumbersArrageInBinaryForm() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        System.out.println("\nMyBinaryTree : " + myBinaryTree);
    }
}