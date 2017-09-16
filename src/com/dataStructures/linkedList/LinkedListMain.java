package com.dataStructures.linkedList;

public class LinkedListMain {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    Node book1 = new Node("White Tiger", 1234);
    linkedList.insertFirstNode(book1);
    
    Node book2 = new Node("Five Point Someone", 3456);
    linkedList.insertFirstNode(book2);
    
    Node book3 = new Node("Immortals of Meluha", 5678);
    linkedList.insertFirstNode(book3);
    
    Node book4 = new Node("3 mistakes of my life", 2468);
    linkedList.insertFirstNode(book4);
    
    Node book5 = new Node("secret of nagas", 3579);
    linkedList.insertFirstNode(book5);
    
    linkedList.display();
    linkedList.removeFirst();
    
    System.out.println("Remove First");
    
    linkedList.display();
    
    System.out.println("Find by book name : "+ "3 mistakes of my life");
    
    Node secret_of_nagas = linkedList.findByBookname("3 mistakes of my life");
    if (secret_of_nagas != null) {
      System.out.println(secret_of_nagas.getBookName() + ", : " + secret_of_nagas.getNoOfBookSold());
    } else {
      System.out.println("No Node found");
    }
    
    Node white_tiger = linkedList.removeNode("Immortals of Meluha");
    
    if (white_tiger != null) {
      System.out.println("Removed Node : " + white_tiger.getBookName());
    } else {
      System.out.println("No Node found");
    }
    
    
    linkedList.display();
  
    System.out.println("Adding at the last ");
  
    Node book6 = new Node("Rich dad poor dad", 2468);
    linkedList.insertAtLastNode(book6);
  
    linkedList.display();
    
    linkedList.removeFirst();
    linkedList.removeFirst();
    linkedList.removeFirst();
    linkedList.removeFirst();
    linkedList.display();
  
    System.out.println(" Insert after all deletes at last");
    linkedList.insertAtLastNode(book6);
    linkedList.insertFirstNode(book1);
    Node book7 = new Node("7th book", 2468);
    
    linkedList.insertAtLastNode(book7);
    linkedList.display();
  
    System.out.println("remove last() : "+linkedList.removeLast().getBookName());
    linkedList.display();
    
  }
}
