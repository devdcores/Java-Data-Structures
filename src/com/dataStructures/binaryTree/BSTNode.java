package com.dataStructures.binaryTree;

public class BSTNode {
  private Integer data;
  private BSTNode leftBSTNode;
  private BSTNode rightBSTNode;
  
  public BSTNode(Integer data) {
    this.data=data;
    leftBSTNode=null;
    rightBSTNode=null;
  }
  
  public BSTNode(Integer data, BSTNode leftBSTNode, BSTNode rightBSTNode) {
    this.data = data;
    this.leftBSTNode = leftBSTNode;
    this.rightBSTNode = rightBSTNode;
  }
  
  public Integer getData() {
    return data;
  }
  
  public void setData(Integer data) {
    this.data = data;
  }
  
  public BSTNode getLeftBSTNode() {
    return leftBSTNode;
  }
  
  public void setLeftBSTNode(BSTNode leftBSTNode) {
    this.leftBSTNode = leftBSTNode;
  }
  
  public BSTNode getRightBSTNode() {
    return rightBSTNode;
  }
  
  public void setRightBSTNode(BSTNode rightBSTNode) {
    this.rightBSTNode = rightBSTNode;
  }
}
