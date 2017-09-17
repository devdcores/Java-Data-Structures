package com.dataStructures.linkedList;

/**
 * @author devaraj reddy
 * @description linkedList is the collection of nodes, where one node points to its next node and
 * last node points to null.
 */
public class LinkedList {
  private Node firstNode;
  
  /**
   * @description construct linkedList object, and set firstNode to null.
   */
  public LinkedList() {
    this.firstNode = null;
  }
  
  /**
   * @return true if the linkedList doesn't have any nodes, else return false.
   * @description to check weather the linked list is empty.
   * @logic if the firstNode is null, then it doesn't have any linked/pointing nodes, so it is empty linkedList.
   */
  public boolean isEmpty() {
    return (firstNode == null);
  }
  
  /**
   * @param newNode
   * @description insert the node at the beginning of the list.
   * @logic make newNode point to the firstNode and set newNode as the firstNode.
   */
  public void insertFirstNode(Node newNode) {
    newNode.setNext(firstNode);
    this.firstNode = newNode;
  }
  
  /**
   * @param newNode
   * @description insert node at the end of the linkedList.
   * @logic check firstNode value, if it is null make the newNode as firstNode.
   * if firstNode not null then traverse through all nodes from firstNode and find which node is pointing to null by checking its next value.
   * after finding the last node. point the last node to the newNode.
   */
  public void insertAtLastNode(Node newNode) {
    Node node = this.firstNode;
    if (node != null) {
      while (node != null) {
        if (node.getNext() == null) {
          node.setNext(newNode);
          return;
        }
        node = node.getNext();
      }
    } else {
      firstNode = newNode;
    }
  }
  
  /**
   * @return node which gets removed.
   * @description remove the firstNode.
   * @logic store the firstNode in variable, to return after it gets removed..
   * get the firstNode's next node and make it as firstNode.
   */
  public Node removeFirst() {
    if (!isEmpty()) {
      Node fNode = this.firstNode;
      Node next = firstNode.getNext();
      this.firstNode = next;
      return fNode;
    } else {
      System.out.println("Empty LinkedList!!!!");
    }
    return null;
  }
  
  /**
   * @return node which gets removed.
   * @description remove the last node in the list.
   * @logic traverse through all node's and find the node which is pointing to null, while traversing store the previous node.
   * after getting lastNode and its previousNode. set the previousNode next to null.
   */
  public Node removeLast() {
    Node node = this.firstNode;
    Node previousNode = this.firstNode;
    while (node != null) {
      if (node.getNext() == null) {
        if (node == previousNode) { // edge condition : when found node is firstNode.
          firstNode = node.getNext();
          return node;
        }
        previousNode.setNext(null);
        return node;
      }
      previousNode = node;
      node = node.getNext();
    }
    System.out.println("Empty LinkedList!!!!");
    return null;
  }
  
  /**
   * @description traverse through the list and display its elements.
   */
  public void display() {
    System.out.println("***********************  Start Display  ********************************");
    Node node = this.firstNode;
    while (node != null) {
      System.out.println("*        " + node.getBookName() + ", : " + node.getNoOfBookSold());
      if (node.getNext() != null)
        System.out.println("*        Next node : " + node.getNext().getBookName());
      else
        System.out.println("*        Next node : " + null);
      node = node.getNext();
    }
    System.out.println("***********************  End Display  **********************************");
    
  }
  
  /**
   * @param bookName
   * @return the found node.
   * @description find the node by its bookName.
   */
  public Node findByBookname(String bookName) {
    Node node = this.firstNode;
    while (node != null) {
      if (node.getBookName().equals(bookName)) {
        return node;
      }
      node = node.getNext();
    }
    return null;
  }
  
  /**
   * @param bookName
   * @return node which gets removed.
   * @description remove any node if its bookName matches with the parameter bookName.
   * @logic traverse through the list and find the node to  be removed.
   * set found node's previous node next to found node's next node.
   */
  public Node removeNode(String bookName) {
    if (!isEmpty()) {
      Node node = this.firstNode;
      Node previousNode = this.firstNode;
      while (node != null) {
        if (node.getBookName().equals(bookName)) {
          if (previousNode.getBookName() == node.getBookName()) { // edge condition : when found node is firstNode.
            firstNode = node.getNext();
            return node;
          }
          previousNode.setNext(node.getNext());
          return node;
        }
        previousNode = node;
        node = node.getNext();
      }
    } else {
      System.out.println("Empty LinkedList!!!!");
    }
    System.out.println("Didn't found any node to remove.");
    return null;
  }
  
  public boolean insertAfterNode(Node newNode, String keyBookNames){
    Node node=firstNode;
    while(node!=null){
      if(node.getBookName().equals(keyBookNames)){
        newNode.setNext(node.getNext());
        node.setNext(newNode);
        return true;
      }
      node=node.getNext();
    }
    return false;
  }
}
