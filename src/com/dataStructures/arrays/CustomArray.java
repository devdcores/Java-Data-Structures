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
    String str = "";
    boolean valueInArray = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        str = str + i + " ";
        valueInArray = true;
      }
    }
    if (!valueInArray) {
      str = "None";
    }
    return str;
  }
  
  public void bubbleSortAscending() {
    for (int i = size - 1; i > 1; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swap(j, j + 1);
//          int temp = array[j];
//          array[j] = array[j + 1];
//          array[j + 1] = temp;
        }
      }
    }
  }
  
  public void binarySearch(int value) {
    
    int low = 0;
    int high = size - 1;
    boolean found = false;
    
    while (low <= high) {
      int mid = (low + high) / 2;
      if (value < array[mid]) {
        high = mid - 1;
      } else if (value == array[mid]) {
        System.out.println("Value : " + value + ", found at index : " + mid);
        found = true;
        break;
      } else {
        low = mid + 1;
      }
    }
    
    if (!found) {
      System.out.println("Value : " + value + ", not found in the array.");
    }
  }
  
  public void selectionSort() {
    for (int i = 0; i < size; i++) {
      int minimum = i;
      for (int j = i; j < size; j++) {
        if (array[minimum] > array[j]) {
          minimum = j;
        }
      }
      swap(minimum, i);
    }
  }
  
  private void swap(int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}

