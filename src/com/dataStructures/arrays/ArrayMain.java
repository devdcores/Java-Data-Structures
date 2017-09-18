package com.dataStructures.arrays;

public class ArrayMain {
  public static void main(String[] args) {
    CustomArray customArray = new CustomArray(10);
    customArray.generateArray();
    customArray.printArray();
  
    System.out.println("Array at index 4 : "+customArray.getValueAtIndex(14));
    System.out.println("Does array contain value 14 : "+customArray.doesArrayContainThisValue(14));
  }
}
