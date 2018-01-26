package com.dataStructures;

public class LinkedListLearning {
  public static void main(String[] args) {
    LinkedListOperations ll = new LinkedListOperations();
    Integer a = 1;
    Integer a1 = 2;
    Integer a2 = 3;
    Integer a3 = 4;
    Integer a4 = 5;
    Integer a5 = 6;
//    ll.insertAtHead(a);
//    ll.insertAtHead(a1);
//    ll.insertAtHead(a2);
//    ll.insertAtHead(a3);
//    ll.insertAtHead(a4);
//    ll.insertAtHead(a5);
//
//
    ll.insertAtEnd(a5);
    ll.insertAtEnd(a4);
    ll.insertAtEnd(a3);
    ll.insertAtEnd(a2);
    ll.insertAtHead(a);
    ll.insertAtHead(a1);
    
    ll.insertAtPosition(1000, 1);
    ll.insertAtPosition(2000, 4);
    ll.display();
   System.out.println("=====================================================");
    ll.realRecursiveReverse();
////    ll.deleteAtPosition(1);
////    ll.display();
////    System.out.println("=====================================================");
////
////    ll.deleteAtPosition(2);
////    ll.display();
////    System.out.println("Reverse =====================================================");
////
////    ll.reverseAndDisplay();
////
////    System.out.println("=====================================================");
//
//    ll.displayUsingRecursion();
//    System.out.println("Done =====================================================");
  
  }
  
  static class Node {
    Integer data;
    Node next;
    
    Node(Integer d) {
      data = d;
    }
  }
  
  static class LinkedListOperations {
    Node head;
  
    LinkedListOperations() {
    
    }
  
    void insertAtHead(Integer a) {
      Node newNode = new Node(a);
      if (head == null) {
        head = newNode;
      } else {
        newNode.next = head;
        head = newNode;
      }
    }
  
    void insertAtEnd(Integer a) {
      Node newNode = new Node(a);
      Node temp = head;
      if (temp == null) {
        head = newNode;
        return;
      }
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  
    void insertAtPosition(Integer a, int n) {
      Node newNode = new Node(a);
      if (n == 1) {
        newNode.next = head;
        head = newNode;
        return;
      }
      Node temp = head;
      for (int i = 0; i < n - 2; i++) {
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
    }
  
    void deleteAtPosition(int n) {
      if (n == 1) {
        head = head.next;
        return;
      }
      Node temp = head;
      for (int i = 0; i < n - 2; i++) {
        temp = temp.next;
      }
    
      Node next = temp.next;
      temp.next = next.next;
    }
  
    void display() {
    
      Node temp = head;
      while (temp != null) {
        System.out.println(" DATA ::::: " + temp.data);
        temp = temp.next;
      }
    }
  
    void reverseAndDisplay() {
    
      Node temp = head;
      Node next;
      Node previous = null;
      while (temp != null) {
        next = temp.next;
        temp.next = previous;
        previous = temp;
        temp = next;
      }
      head = previous;
      this.display();
    }
  
    void displayUsingRecursion() {
    
      //displayBro(head);
      System.out.println("HEREREREER");
      displayReverse(head);
    }
  
    void displayBro(Node headCopy) {
      System.out.println("Recursion :::: " + headCopy.data);
      if (headCopy.next != null) {
        displayBro(headCopy.next);
      }
    }
  
    void displayReverse(Node headCopy) {
  
      if (headCopy.next != null) {
        displayReverse(headCopy.next);
      }
      System.out.println("Recursion :::: " + headCopy.data);
    }
  
    void realRecursiveReverse(){
      realReverseUsingRecursion(head);
      display();
    }
  
    void realReverseUsingRecursion(Node headCopy){
      if(headCopy.next==null){
        head=headCopy;
        return;
      }
      realReverseUsingRecursion(headCopy.next);
      Node next = headCopy.next;
      next.next=headCopy;
      headCopy.next=null;
    }
  }
}
