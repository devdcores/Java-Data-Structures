package com.dataStructures.arrays;

public class ArrayMain {
  public static void main(String[] args) {
    CustomArray customArray = new CustomArray(10);
  
    System.out.println(">>>>>>>> Generating random array.");
    customArray.generateArray();
    customArray.printArray();

    System.out.println(">>>>>>>> Array at index 4 : "+customArray.getValueAtIndex(4));
    System.out.println(">>>>>>>> Does array contain value 14 : "+customArray.doesArrayContainThisValue(14));

    System.out.println(">>>>>>>> Delete from array at index : 5");
    customArray.deleteIndex(5);
    customArray.printArray();

    System.out.println(">>>>>>>> Insert value into array.");
    customArray.insertValue(123);
    customArray.printArray();

    System.out.println("Linear search of 17 found at index : "+customArray.linearSearch(17));
  
    System.out.println(">>>>>>>> Sorting the array using Bubble Sort.");
    customArray.bubbleSortAscending();
    customArray.printArray();
  
    System.out.println(">>>>>>>> Binary Search.");
    customArray.binarySearch(16);
  
    System.out.println(">>>>>>>> Generating random array.");
    customArray.generateArray();
    customArray.printArray();
    System.out.println(">>>>>>>> Sorting the array using Selection Sort.");
    customArray.selectionSort();
    customArray.printArray();
  
    System.out.println(">>>>>>>> Generating random array.");
    customArray.generateArray();
    customArray.printArray();
    System.out.println(">>>>>>>> Sorting the array using Insertion Sort.");
    customArray.insertionSort();
    customArray.printArray();
   
  }
}
