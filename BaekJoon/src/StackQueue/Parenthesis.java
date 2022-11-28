package StackQueue;

import java.util.Scanner;
import java.util.Stack;

// 올바른 괄호
public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.isEmpty()) {
                    result = "NO";
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            result = "NO";
        }

        System.out.println(result);
    }
}
