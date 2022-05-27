package com.melvinkimathi.com.blind75questions.strings;

import java.util.Stack;

public class validParantheses {
    public static boolean isValid(String s) {

        //check if the string is odd, if true, return false --> because the brackets must be in pairs
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                //push to the stack
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(([()]))";
        System.out.printf("valid parantheses: " +  isValid(s));
    }
}
