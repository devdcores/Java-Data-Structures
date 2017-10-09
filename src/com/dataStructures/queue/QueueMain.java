package com.dataStructures.queue;

public class QueueMain {
  public static void main(String[] args) {
    Queue queue = new Queue(10);
    System.out.println(">>>>>>>>> Inserting Elements <<<<<<<<<<<");
    queue.insert("devd");
    queue.insert("reddy");
    queue.insert("g");
    queue.display();
  
    System.out.println(">>>>>>>>> Removing Element <<<<<<<<<<<");
    queue.remove();
    queue.display();
    
    System.out.println(">>>>>>>>>> PEEK : " + queue.peek());
  
    System.out.println(">>>>>>>>> Removing All Elements <<<<<<<<<<<");
    queue.popAll();
    queue.display();
  
    System.out.println(">>>>>>>>> Inserting Elements on Priority (length of the string) <<<<<<<<<<<");
    
    queue.priorityInsert("one");
    queue.priorityInsert("four");
    queue.priorityInsert("1");
    queue.priorityInsert("seven");
    queue.priorityInsert("two");
    queue.display();
  
  }
}
