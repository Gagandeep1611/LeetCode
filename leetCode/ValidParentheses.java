package leetCode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stringStack = new Stack<>();
        for (int current = 0; current < s.length(); current++) {
            if (s.charAt(current) == '(' || s.charAt(current) == '{' || s.charAt(current) == '[') {
                stringStack.push(s.charAt(current));
            } else {
                if (stringStack.isEmpty()) {
                    return true;
                } else {
                    if (s.charAt(current) == ')') {
                        if (stringStack.peek() == '(') {
                            stringStack.pop();
                        } else {
                            return false;
                        }
                    } else if (s.charAt(current) == '}') {
                        if (stringStack.peek() == '{') {
                            stringStack.pop();
                        } else {
                            return false;
                        }
                    }else if(s.charAt(current)==']'){
                        if(stringStack.peek()=='['){
                            stringStack.pop();
                        }else{return false;}
                    }
                }
            }

        }
        return false;
    }
        public static void main (String[]args){

            String s1 = "{}";
            ValidParentheses validParentheses = new ValidParentheses();

            System.out.println(validParentheses.isValid(s1));
        }
    }
