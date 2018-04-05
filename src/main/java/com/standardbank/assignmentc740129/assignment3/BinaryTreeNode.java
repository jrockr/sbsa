package com.standardbank.assignmentc740129.assignment3;

public class BinaryTreeNode {

  private BinaryTreeNode right;
  private BinaryTreeNode left;
  private int value;

  BinaryTreeNode(int value){
    this.value = value;
    right=left=null;
  }


  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public BinaryTreeNode getRight() {
    return right;
  }

  public void setRight(BinaryTreeNode right) {
    this.right = right;
  }

  public BinaryTreeNode getLeft() {
    return left;
  }

  public void setLeft(BinaryTreeNode left) {
    this.left = left;
  }
}
