package com.dataStructures.binaryTree;

public class BinaryTreeOperations {
  
  BSTNode root;
  
  void insert(Integer data) {
    root = insertRec(root,data);
  }
  
  private BSTNode insertRec(BSTNode root, Integer data) {
    BSTNode bstNode = new BSTNode(data);
    if(root==null){
      root = bstNode;
    }else if ( data <= root.getData()){
      root.setLeftBSTNode(insertRec(root.getLeftBSTNode(),data));
    }
    else{
      root.setRightBSTNode(insertRec(root.getRightBSTNode(),data));
    }
    return root;
  }
  
  void display() {
  
    displayRec(root);
    
  }
  
  private void displayRec(BSTNode root) {
    if (root != null) {
      displayRec(root.getLeftBSTNode());
      System.out.println(root.getData());
      displayRec(root.getRightBSTNode());
    }
  }
  
}
