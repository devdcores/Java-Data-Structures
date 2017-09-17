package com.dataStructures.linkedList;

/**
 * @author devaraj reddy
 */
public class LinkedListMain {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    
    //Insert at the first Node
    System.out.println(">>> Insert Node at First");
    Node book1 = new Node("White Tiger", 1234);
    linkedList.insertFirstNode(book1);
    linkedList.display();
    
    //Insert at the first Node
    System.out.println(">>> Insert Node at First");
    Node book2 = new Node("Five Point Someone", 2345);
    linkedList.insertFirstNode(book2);
    linkedList.display();
    
    
    //Insert at the last Node
    System.out.println(">>> Insert Node at Last");
    Node book3 = new Node("Immortals of Meluha", 3456);
    linkedList.insertAtLastNode(book3);
    linkedList.display();
    
    //remove the  first Node
    System.out.println(">>> remove the  first Node");
    linkedList.removeFirst();
    linkedList.display();
    
    //remove the  last Node
    System.out.println(">>> remove the  last Node");
    linkedList.removeLast();
    linkedList.display();
    
    //remove the  last Node, Edge condition
    System.out.println(">>> remove the  last Node, Edge condition");
    linkedList.removeLast();
    linkedList.display();
    
    System.out.println(">>> Adding few nodes in to the list");
    Node book4 = new Node("3 mistakes of my life", 2468);
    linkedList.insertFirstNode(book4);
    
    Node book5 = new Node("secret of nagas", 3579);
    linkedList.insertFirstNode(book5);
    
    Node book6 = new Node("Rich dad poor dad", 2468);
    linkedList.insertAtLastNode(book6);
    
    linkedList.display();
    
    System.out.println(">>> Find the node by its book name..... : Finding 3 mistakes of my life");
    
    Node byBookname = linkedList.findByBookname("3 mistakes of my life");
    if (byBookname != null) {
      System.out.println("Found : " + byBookname.getBookName());
    }
    
    System.out.println(">>> Find the node by its book name..... : the alchemist");
    
    Node byBookname2 = linkedList.findByBookname("the alchemist");
    if (byBookname2 != null) {
      System.out.println("Found : " + byBookname.getBookName());
    } else {
      System.out.println("Book Not Found");
    }
  
    System.out.println(">>> Remove any node by book name");
    linkedList.removeNode("3 mistakes of my life");
    linkedList.display();
  
    System.out.println(">>> Remove any node by book name");
    linkedList.removeNode("secret of nagas");
    linkedList.display();
  
    System.out.println(">>> Remove any node by book name");
    linkedList.removeNode("Rich dad poor dad");
    linkedList.display();
  
    System.out.println(">>> Adding few nodes in to the list");
    linkedList.insertFirstNode(book4);
    linkedList.insertFirstNode(book5);
    linkedList.insertAtLastNode(book6);
  
    linkedList.display();
    
    System.out.println(">>> insert Node after key");
    Node book7 = new Node("oath of vayuputras", 2468);
    linkedList.insertAfterNode(book7,"secret of nagas");
    
    linkedList.display();
    
  }
}
