package com.dataStructures.stack;

public class Stack {
    private int top;
    private int size;
    private String[] stack;
    public Stack(int size){
        this.top=-1;
        this.size=size;
        stack=new String[this.size];
    }

    public void push(String element){
        if(top<size-1) {
            stack[++top] = element;
        }
        else{
            System.out.println("Stack Overflow!!!!!");
        }
    }

    public String pop(){
        if(top != -1){
            String topElement = stack[top];
            stack[top]=null;
            top--;
            return topElement;
        }
        else
        {
            System.out.println("No Element to Return");
        }
        return null;
    }
    
    public String peek(){
        if(top != -1){
            String topElement = stack[top];
            return topElement;
        }
        else
        {
            System.out.println("No Element to Return");
        }
        return null;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public String[] allElementsInStack(){
        return stack;
    }
}
