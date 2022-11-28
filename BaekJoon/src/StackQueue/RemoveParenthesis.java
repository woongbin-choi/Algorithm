package StackQueue;

import java.util.Scanner;
import java.util.Stack;

// 괄호문자제거
public class RemoveParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x==')') {
                while(stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for (int i = 0; i < stack.size(); ++i) {
            result += stack.get(i);
        }

        System.out.println(result);
    }
}
