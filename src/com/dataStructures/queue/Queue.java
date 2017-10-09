package com.dataStructures.queue;

import java.util.Arrays;

public class Queue {
  
  private String[] queueArray;
  private int queueSize;
  private int front, rear, numberOfItems = 0;
  
  public Queue(int size) {
    this.queueSize = size;
    queueArray = new String[size];
  }
  
  public void display() {
    System.out.println("************************* Start of Display *******************************");
    System.out.println("*    Elements in the queue : " + Arrays.asList(queueArray));
    System.out.println("************************* End of Display *********************************");
  }
  
  public void insert(String element) {
    if (numberOfItems < queueSize) {
      queueArray[rear] = element;
      rear++;
      numberOfItems++;
    } else {
      System.out.println("Queue is full");
    }
  }
  
  public void remove() {
    if (numberOfItems > 0) {
      queueArray[front] = null;
      front++;
      numberOfItems--;
    } else {
      System.out.println("No elements to remove from queue");
    }
  }
  
  public String peek() {
    if (numberOfItems != 0) {
      return queueArray[front];
    }
    return null;
  }
  
  //priority based on the length of the string.
  public void priorityInsert(String element) {
    int i;
    if (numberOfItems == 0) {
      insert(element);
    } else {
      for (i = numberOfItems - 1; i >= 0; i--) {
        if (element.length() > queueArray[i].length()) {
          queueArray[i + 1] = queueArray[i];
        } else {
          break;
        }
      }
      queueArray[i + 1] = element;
      rear++;
      numberOfItems++;
    }
  }
  
  public void popAll(){
    for(int i=rear-1;i>=0;i--){
      queueArray[i]=null;
    }
    numberOfItems=0;
    rear=0;
    front=0;
    
  }
}
