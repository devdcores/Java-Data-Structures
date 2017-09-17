package com.dataStructures.stack;

import java.util.Arrays;

/**
 * @author : devaraj reddy
 * @description : StackMain Class
 */
public class StackMain {
		
		public static void main(String[] args) {
				// Initialize the size of the stack.
				Stack stack =new Stack(4);
				
				System.out.println("check is empty stack : "+stack.isEmpty());
				
				System.out.println("$$$$$$$$ pushing some elements $$$$$$$$");
				//Push some elements into the stack.
				stack.push("Devaraj");
				stack.push("Reddy");
				stack.push("G");
				
				//Display the present elements.
				stack.display();
				
				System.out.println("check is empty stack : "+stack.isEmpty());
				
				System.out.println("$$$$$$$$ poping some elements $$$$$$$$");
				
				//Pop some elements from the stack.
				stack.pop();
				stack.pop();
				
				//Display the present elements.
				stack.display();
				
				System.out.println("$$$$$$$$ Stack Overflow happens when the limit exceeds. $$$$$$$$");
				
				//Push some more elements to show stack overflow.
				stack.push("bangalore");
				stack.push("india");
				stack.push("karnataka");
				stack.push("kgf");
				
		}
}
