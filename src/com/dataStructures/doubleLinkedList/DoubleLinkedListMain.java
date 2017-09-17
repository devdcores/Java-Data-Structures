package com.dataStructures.doubleLinkedList;

public class DoubleLinkedListMain {
  public static void main(String[] args) {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
  
    System.out.println("------> insert In First Position");
    Node firstNode = new Node("1st Neighbour", 123);
    doubleLinkedList.insertInFirstPosition(firstNode);
    doubleLinkedList.display();
  
    System.out.println("------> insert In First Position");
    Node secondNode = new Node("2nd Neighbour", 234);
    doubleLinkedList.insertInFirstPosition(secondNode);
    doubleLinkedList.display();
  
    System.out.println("------> Remove At First Position");
    doubleLinkedList.removeAtFirstPosition();
    doubleLinkedList.display();
  
    System.out.println("------> insert In First Position");
    Node thirdNode = new Node("3rd Neighbour", 456);
    doubleLinkedList.insertInFirstPosition(thirdNode);
    doubleLinkedList.display();
  
    System.out.println("------> Remove At Last Position");
    doubleLinkedList.removeAtLastPosition();
    doubleLinkedList.display();
    
    /*
    uncomment below code and comment all other code for inorder traversal.
    
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    
    Node Node1 = new Node("Neighbour 1", 1);
    Node Node2 = new Node("Neighbour 2", 2);
    Node Node3 = new Node("Neighbour 3", 3);
    Node Node4 = new Node("Neighbour 4", 4);
    Node Node5 = new Node("Neighbour 5", 5);
    Node Node6 = new Node("Neighbour 6", 6);
    Node Node7 = new Node("Neighbour 7", 7);

    doubleLinkedList.insertInOrder(Node1);
    doubleLinkedList.insertInOrder(Node5);
    doubleLinkedList.insertInOrder(Node3);
    doubleLinkedList.insertInOrder(Node7);
    doubleLinkedList.insertInOrder(Node2);
    doubleLinkedList.insertInOrder(Node4);
    doubleLinkedList.insertInOrder(Node6);

    doubleLinkedList.display();
    */
  }
}
