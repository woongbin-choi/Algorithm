package StackQueue;

import java.util.Scanner;
import java.util.Stack;

// 쇠막대기 자르기
public class MetalRod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int result  = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if(str.charAt(i-1) == '(') {
                    result += stack.size();
                } else {
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
