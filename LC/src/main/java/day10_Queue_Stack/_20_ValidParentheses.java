package day10_Queue_Stack;

import java.util.Stack;

public class _20_ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>(); //khoi tao doi tuong
        for (char c : s.toCharArray()) { //dung foreach duyet qua tung ky tu trong chuoi
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}