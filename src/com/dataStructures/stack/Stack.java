package com.dataStructures.stack;

import java.util.Arrays;

/**
 * @author : devaraj reddy
 * @description : Stack Class
 */
public class Stack {
		private int top;
		private int size;
		private String[] stack;
		
		/**
		 * @param : size of the stack.
		 * @description : Initialize the stack object with the maximum size the stack can grow
		 */ 
		public Stack(int size) {
				this.top = -1;
				this.size = size;
				stack = new String[this.size];
		}
		
		/**
		 * @param : element to be added.
		 * @description : To add/Push an element in to the stack.
		 * @logic : Add an element in to the stack array after increasing the top. If the top is more or equal to size then print
		 * stack overflow as it exceeds the size of the stack.
		 */
		public void push(String element) {
				if (top < size - 1) {
						stack[++top] = element;
				} else {
						System.out.println("Stack Overflow!!!!!");
				}
		}
		
		/**
		 * @description : To remove/pop an element from the stack.
		 * @logic : Remove an element and return from the stack, check if array is empty then remove element and decrement the top.
		 * @return : The top most element.
		 */
		public String pop() {
				if (top != -1) {
						String topElement = stack[top];
						stack[top] = null;
						top--;
						return topElement;
				} else {
						System.out.println("No Element to Return");
				}
				return null;
		}
		
		/**
		 * @description : Return the top most element in the stack.
		 * @logic : Return the top most element on the stack, if empty stack return print no elements and return null.
		 * @return : The top most element.
		 */
		public String peek() {
				if (top != -1) {
						String topElement = stack[top];
						return topElement;
				} else {
						System.out.println("No Element to Return");
				}
				return null;
		}
		
		/**
		 * @description : To check if the stack is empty.
		 * @logic : If the value of top, if it is -1 then the stack is empty.
		 * @return : true if the stack is empty else false.
		 */
		public boolean isEmpty() {
				return top == -1;
		}
		
		/**
		 * @description : Return all the elements in the stack.
		 * @logic :
		 * @return all the elements in the stack.
		 */
		public String[] getAllElementsInStack() {
				return stack;
		}
		
		/**
		 * @description : display the elements in the stack.
		 */
		public void display(){
				System.out.println("************************* Start of Display *******************************");
				System.out.println("*    Elements in the stack : "+ Arrays.asList(getAllElementsInStack()));
				System.out.println("************************* End of Display *********************************");
		}
}
