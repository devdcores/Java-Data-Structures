package LinkedList;

public class LinkedList {
  private Node firstNode;
  
  public LinkedList() {
    this.firstNode = null;
  }
  
  public boolean isEmpty() {
    return (firstNode == null);
  }
  
  public void insertFirstNode(Node newNode) {
    newNode.setNext(firstNode);
    this.firstNode = newNode;
  }
  
  
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
  
  public Node removeLast() {
    Node node = this.firstNode;
    Node previousNode = this.firstNode;
    if (node != null) {
      while (node != null) {
        if (node.getNext() == null) {
          previousNode.setNext(null);
          return node;
        }
        previousNode=node;
        node = node.getNext();
      }
    } else {
      System.out.println("Empty LinkedList!!!!");
    }
    return null;
  }
  
  public void display() {
    System.out.println("***********************Start Display********************************");
    Node node = this.firstNode;
    while (node != null) {
      System.out.println(node.getBookName() + ", : " + node.getNoOfBookSold());
      if (node.getNext() != null)
        System.out.println("Next Link : " + node.getNext().getBookName());
      else
        System.out.println("Next Link : " + null);
      node = node.getNext();
    }
    System.out.println("***********************End Display********************************");
    
  }
  
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
  
  public Node removeNode(String bookName) {
    
    if (!isEmpty()) {
      Node node = this.firstNode;
      Node previousNode = this.firstNode;
      while (node != null) {
        if (node.getBookName().equals(bookName)) {
          if (previousNode.getBookName() == node.getBookName()) {
            firstNode = node.getNext();
          }
          previousNode.setNext(node.getNext());
          return node;
        }
        previousNode = node;
        node = node.getNext();
      }
    }
    else
    {
      System.out.println("Empty LinkedList!!!!");
    }
    return null;
  }
}
