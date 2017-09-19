package com.dataStructures.arrays;

public class CustomArray {
  public int[] array = new int[100];
  private int size;
  
  public CustomArray(int size) {
    this.size = size;
  }
  
  //Insert Some elements in to the array.
  public void generateArray() {
    for (int i = 0; i < size; i++) {
      array[i] = (int) (Math.random() * 10 + 10);
    }
  }
  
  //To print the elements in the array.
  public void printArray() {
    System.out.println("----------");
    for (int i = 0; i < size; i++) {
      System.out.println("| " + i + " | " + array[i] + " |");
    }
    System.out.println("----------");
  }
  
  public int getValueAtIndex(int index) {
    if (index < size)
      return array[index];
    return 0;
  }
  
  public boolean doesArrayContainThisValue(int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return true;
      }
    }
    return false;
  }
  
  public void deleteIndex(int index) {
    if (index < size) {
      for (int i = index; i < array.length - 1; i++) {
        array[i] = array[i + 1];
      }
      size--;
    }
  }
  
  public void insertValue(int value) {
    if (size < 100) {
      array[size] = value;
      size++;
    } else {
      System.out.println("Array is full !!!!");
    }
  }
  
  public String linearSearch(int value) {
    StringBuilder str = new StringBuilder();
    boolean valueInArray=false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        str.append(i+" ");
        valueInArray=true;
      }
    }
    if(!valueInArray){
      str.append("None");
    }
    return str.toString();
  }
  
  
}
