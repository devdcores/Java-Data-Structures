package com.dataStructures.doubleLinkedList;

public class DoubleLinkedListMain {
  public static void main(String[] args) {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
//    Node firstNode = new Node("1st Neighbour", 123);
//    doubleLinkedList.insertInFirstPosition(firstNode);
//    doubleLinkedList.display();
//    Node secondNode = new Node("2nd Neighbour", 234);
//    doubleLinkedList.insertInFirstPosition(secondNode);
//    //doubleLinkedList.display();
//
//    Node thirdNode = new Node("3rd Neighbour", 456);
//    doubleLinkedList.insertInFirstPosition(thirdNode);
//
//    Node fourthNode = new Node("4th Neighbour", 789);
//    doubleLinkedList.insertInFirstPosition(fourthNode);
//    doubleLinkedList.display();
//
//    Node zeroNode = new Node("0th Neighbour", 123);
//    doubleLinkedList.insertInLastPosition(zeroNode);
//
//    Node minus1Node = new Node("-1th Neighbour", 123);
//    doubleLinkedList.insertInLastPosition(minus1Node);
//    doubleLinkedList.display();
//
//    Node afterNode = new Node("after Neighbour", 123);
//    doubleLinkedList.insertAfterKey(afterNode,"4th Neighbour");
//    doubleLinkedList.display();
    
    
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
  }
}
