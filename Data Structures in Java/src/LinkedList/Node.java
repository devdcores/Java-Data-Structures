package LinkedList;

public class Node {
  private String bookName;
  private int noOfBookSold;
  
  private Node next;
  
  public Node(String bookName, int noOfBookSold) {
    this.bookName = bookName;
    this.noOfBookSold = noOfBookSold;
  }
  
  public String getBookName() {
    return bookName;
  }
  
  public void setBookName(String bookName) {
    this.bookName = bookName;
  }
  
  public int getNoOfBookSold() {
    return noOfBookSold;
  }
  
  public void setNoOfBookSold(int noOfBookSold) {
    this.noOfBookSold = noOfBookSold;
  }
  
  public Node getNext() {
    return next;
  }
  
  public void setNext(Node next) {
    this.next = next;
  }
}
