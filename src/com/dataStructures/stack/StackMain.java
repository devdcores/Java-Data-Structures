package com.dataStructures.stack;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) {
        Stack stack =new Stack(5);
        stack.push("Devaraj");
        System.out.println("Elements : "+Arrays.asList(stack.allElementsInStack()));
        
        stack.push("Reddy");
        System.out.println("Elements : "+Arrays.asList(stack.allElementsInStack()));
        System.out.println("Peek Element  : "+stack.peek());
        
        stack.pop();
        System.out.println("Peek Element  : "+stack.peek());
        
        stack.pop();
        System.out.println("Peek Element  : "+stack.peek());
        
        stack.pop();
    
        stack.push("Devaraj");
        System.out.println("Elements : "+Arrays.asList(stack.allElementsInStack()));
        System.out.println("Peek Element  : "+stack.peek());
    
        stack.push("rale");
        System.out.println("Elements : "+Arrays.asList(stack.allElementsInStack()));
        System.out.println("Peek Element  : "+stack.peek());
    
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println("Elements : "+Arrays.asList(stack.allElementsInStack()));
        stack.push("6");
    }
}
