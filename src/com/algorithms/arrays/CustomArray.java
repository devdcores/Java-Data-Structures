package com.algorithms.arrays;

/**
 * @author devaraj reddy
 */
public class CustomArray {
  public int[] array = null;
  private int size;
  
  public CustomArray(int size) {
    this.size = size;
  }
  
  //Insert Some elements in to the array.
  public void generateArray() {
    array = new int[100];
    ;
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
  
  /**
   * @param index
   * @return the value at index in the array.
   */
  public int getValueAtIndex(int index) {
    if (index >= 0 && index < size)
      return array[index];
    return 0;
  }
  
  /**
   * @param value
   * @return true if the value exists in the array, else false.
   * @description check weather value exists in the array.
   */
  public boolean doesArrayContainThisValue(int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * @param index
   * @description delete the value in the array for index in params.
   */
  public void deleteIndex(int index) {
    if (index < size) {
      for (int i = index; i < array.length - 1; i++) {
        array[i] = array[i + 1];
      }
      size--;
    }
  }
  
  /**
   * @param value
   * @description add the value to end of the array.
   */
  public void insertValue(int value) {
    if (size < 100) {
      array[size] = value;
      size++;
    } else {
      System.out.println("Array is full !!!!");
    }
  }
  
  /**
   * @param value
   * @return the index's of the value.
   * @description to find the indexes of the value.
   * @logic traverse through the array, check the value at the index matches the param value, if yes add the indexes to string array and return.
   */
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
  
  /**
   * This is the worst sort algorithm in terms of time.
   *
   * @description sort the values in the array.
   * @logic move the biggest number in the array to the end of the array.
   * For every iteration in inner for loop the biggest number moves to the end.
   */
  public void bubbleSortAscending() {
    for (int i = size - 1; i > 1; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swap(j, j + 1);
        }
      }
    }
  }
  
  /**
   * @param value
   * @description search the value in the array and print.
   * @logic Binary search works based on divide and conquer algorithm.
   * For this algorithm to work the values has to be in sorted order.
   * divide the array into two parts and check the value is present in which part, do this until the value if found.
   */
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
  
  /**
   * @description to sort the values in the array. Better than bubble sort.
   * @logic make the current element as minimum and check is there any minimum value in rest of the array,
   * if yes then swap. else increment and repeat the same.
   */
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
  
  //Swap the two values in the array based on index.
  private void swap(int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
  
  /**
   * @description to sort the values in the array. Better than selection sort. good for less size of data sets.
   * @logic all the elements before the current element should be sorted..
   * since there are no elements to first element, so it is already sorted.
   */
  public void insertionSort() {
    for (int i = 1; i < size; i++) {
      int j = i;
      while (i > 0 && array[i] < array[i - 1]) {
        swap(i, i - 1);
        i--;
      }
      i = j;
    }
  }
  
  
  public void mergeSort(int[] array, int start, int end) {
    
    int low = start;
    int high = end;
    int middle = (start + end) / 2;
    
    if (low >= high) {
      return;
    }
    mergeSort(array, low, middle);
    mergeSort(array, middle + 1, end);
    
    int end_low = middle;
    int start_high = middle + 1;
    
    while ((low <= end_low) && (start_high <= high)) {
      
      if (array[low] < array[start_high]) {
        low++;
      } else {
        int temp = array[start_high];
        for (int i = start_high - 1; i >= low; i--) {
          array[i + 1] = array[i];
        }
        array[low] = temp;
        low++;
        start_high++;
        end_low++;
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print("| " + array[i] + " |");
    }
    System.out.println();
  }
}

