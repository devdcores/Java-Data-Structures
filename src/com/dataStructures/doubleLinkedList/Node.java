package com.dataStructures.doubleLinkedList;

public class Node {
  private String houseOwnerName;
  private int phoneNumber;
  
  private Node previous;
  private Node next;
  
  public Node(String houseOwnerName, int phoneNumber) {
    this.houseOwnerName = houseOwnerName;
    this.phoneNumber = phoneNumber;
  }
  
  public String getHouseOwnerName() {
    return houseOwnerName;
  }
  
  public void setHouseOwnerName(String houseOwnerName) {
    this.houseOwnerName = houseOwnerName;
  }
  
  public int getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public Node getPrevious() {
    return previous;
  }
  
  public void setPrevious(Node previous) {
    this.previous = previous;
  }
  
  public Node getNext() {
    return next;
  }
  
  public void setNext(Node next) {
    this.next = next;
  }
  
  public void display(){
    System.out.println(houseOwnerName +" ::::: "+ phoneNumber);
  }
  
  public String toString(){
    return houseOwnerName;
  }
}
