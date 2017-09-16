package DoubleLinkedlist;

public class DoubleLinkedList {
  
  Node firstNode;
  Node lastNode;
  
  public DoubleLinkedList() {
  }
  
  public void insertInFirstPosition(Node node) {
    if (isEmpty()) {
      lastNode = node;
    } else {
      firstNode.setPrevious(node);
    }
    node.setNext(firstNode);
    firstNode = node;
  }
  
  public void insertInLastPosition(Node newNode) {
    if (isEmpty()) {
      firstNode = newNode;
    } else {
      lastNode.setNext(newNode);
    }
    newNode.setPrevious(lastNode);
    lastNode = newNode;
  }
  
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
  
  public void insertInOrder(Node newNode) {
    
    Node previousNode = null;
    
    if (isEmpty()) {
      firstNode = newNode;
    } else {
      Node node = firstNode;
      while (node != null && newNode.getPhoneNumber() > node.getPhoneNumber()) {
        previousNode = node;
        node = node.getNext();
      }
      previousNode.setNext(newNode);
      newNode.setPrevious(previousNode);
      if (node != null) {
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
        System.out.println(node.getHouseOwnerName() + " ::::: " + node.getPhoneNumber());
        node = node.getNext();
      }
    }
    System.out.println("*********************End of Display ***********************");
  }
}
