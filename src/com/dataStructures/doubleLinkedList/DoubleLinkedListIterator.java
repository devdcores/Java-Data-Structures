package com.dataStructures.doubleLinkedList;

public class DoubleLinkedListIterator {
  Node currentNode;
  DoubleLinkedList doubleLinkedList;
  
  public DoubleLinkedListIterator(DoubleLinkedList doubleLinkedList) {
    this.doubleLinkedList = doubleLinkedList;
    currentNode = doubleLinkedList.firstNode;
  }
  
  public boolean hasNext() {
    if (currentNode!=null) {
      return currentNode.getNext() != null;
    }
    return false;
  }
  
  public Node next() {
    if (hasNext()) {
      currentNode = currentNode.getNext();
      return currentNode;
    }
    return null;
  }
  
  public void remove() {
    if (!doubleLinkedList.isEmpty()) {
      Node pNode = this.currentNode.getPrevious();
      Node nextNode = this.currentNode.getNext();
      if (nextNode == null) { // Edge case, if it is the last node.
        currentNode = null;
        return;
      }
      if (pNode != null) { // Edge case, if it is first node.
        pNode.setNext(nextNode);
      }
      nextNode.setPrevious(pNode);
      currentNode = nextNode;
    } else {
      System.out.println("Empty Linked List!!!");
    }
  }
  
}
