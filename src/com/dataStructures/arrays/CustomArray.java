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
      array[i]=(int)(Math.random()*10+10);
    }
  }
  
  //To print the elements in the array.
  public void printArray(){
    System.out.println("----------");
    for (int i = 0; i < size; i++) {
      System.out.println("| "+i+" | " +array[i]+" |");
    }
    System.out.println("----------");
  }
  
  public int getValueAtIndex(int index){
    if(index < size )
      return array[index];
    return 0;
  }
  
  public boolean doesArrayContainThisValue(int value){
    for(int i=0;i<array.length;i++){
      if(array[i]==value){
        return true;
      }
    }
    return false;
  }
}

