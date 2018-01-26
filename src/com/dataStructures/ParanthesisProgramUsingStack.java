package com.dataStructures;

import com.dataStructures.stack.Stack;

public class ParanthesisProgramUsingStack {
    public static void main(String[] args) {


        String expression = "{()}{(})";
        Stack stack = new Stack(100);

        for (int i = 0; i < expression.length(); i++) {
            String letter = String.valueOf(expression.charAt(i));

            if (letter.equals("{") || letter.equals("(") || letter.equals("[")) {
                stack.push(letter);
            } else if (letter.equals("}") || letter.equals(")") || letter.equals("]")) {
                if (stack.isEmpty() || !isItAPair(stack.peek(), letter)) {
                    System.out.println("Not Balanced!!!");
                    return;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty())
            System.out.println("Balanced!!!");
        else {
            System.out.println("Not Balanced!!!");
        }
    }

    private static boolean isItAPair(String opening, String closing) {
        if (opening.equals("{") && closing.equals("}"))
            return true;
        else if (opening.equals("(") && closing.equals(")"))
            return true;
        else if (opening.equals("[") && closing.equals("]"))
            return true;
        return false;
    }
}
