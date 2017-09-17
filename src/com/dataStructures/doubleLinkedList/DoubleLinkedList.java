package com.dataStructures.doubleLinkedList;

public class DoubleLinkedList {
  
  Node firstNode;
  Node lastNode;
  
  public DoubleLinkedList() {
  }
  
  /**
   * @param node
   * @description add node at the first position.
   */
  public void insertInFirstPosition(Node node) {
    if (isEmpty()) {
      lastNode = node;
    } else {
      firstNode.setPrevious(node);
    }
    node.setNext(firstNode);
    firstNode = node;
  }
  
  public Node removeAtFirstPosition() {
    if (!isEmpty()) {
      Node next = firstNode.getNext();
      firstNode = next;
      firstNode.setPrevious(null);
    } else {
      System.out.println("Empty List!!!!");
    }
    return null;
  }
  
  /**
   * @param newNode
   * @description add node at the last position.
   */
  public void insertInLastPosition(Node newNode) {
    if (isEmpty()) {
      firstNode = newNode;
    } else {
      lastNode.setNext(newNode);
    }
    newNode.setPrevious(lastNode);
    lastNode = newNode;
  }
  
  public Node removeAtLastPosition() {
    if (!isEmpty()) {
      Node previous = lastNode.getPrevious();
      lastNode = previous;
      lastNode.setNext(null);
    } else {
      System.out.println("Empty List!!!!");
    }
    return null;
  }
  
  /**
   * @param newNode
   * @param key
   * @return true if node inserted in to the list.
   * @description insert newNode after the keyNode.
   */
  public boolean insertAfterKey(Node newNode, String key) {
    if (isEmpty()) {
      return false;
    } else {
      Node node = firstNode;
      while (node != null) {
        if (node.getHouseOwnerName().equals(key)) {
          Node preserveNextNode = node.getNext();
          node.setNext(newNode);
          newNode.setPrevious(node);
          newNode.setNext(preserveNextNode);
          preserveNextNode.setPrevious(newNode);
          return true;
        }
        node = node.getNext();
      }
    }
    return false;
  }
  
  /**
   * @param newNode
   * @description add the nodes in an order.
   */
  public void insertInOrder(Node newNode) {
    Node previousNode = null;
    if (isEmpty()) {
      firstNode = newNode;
    } else {
      Node node = firstNode;
      while (node != null && newNode.getPhoneNumber() > node.getPhoneNumber()) { // check both conditions, because we have to insert in order.
        previousNode = node;
        node = node.getNext();
      }
      previousNode.setNext(newNode);
      newNode.setPrevious(previousNode);
      if (node != null) { // to avoid null pointer exception at the last node.
        newNode.setNext(node);
        node.setPrevious(newNode);
      }
    }
  }
  
  
  public boolean isEmpty() {
    return (firstNode == null);
  }
  
  public void display() {
    System.out.println("*********************Start of Display ***********************");
    if (!isEmpty()) {
      Node node = firstNode;
      while (node != null) {
        System.out.println("*        Previous Node : " + node.getPrevious());
        System.out.println("*        >>>>>>>> " + node.getHouseOwnerName() + " ::::: " + node.getPhoneNumber());
        System.out.println("*        Next Node : " + node.getNext());
        System.out.println("*");
        node = node.getNext();
      }
    }
    System.out.println("*********************End of Display *************************");
  }
}
