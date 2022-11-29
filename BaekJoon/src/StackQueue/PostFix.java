package StackQueue;

import java.util.Scanner;
import java.util.Stack;

// 후위식 연산
public class PostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x-48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') {
                    stack.push(lt+rt);
                } else if (x == '-') {
                    stack.push(lt-rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        result = stack.get(0);

        System.out.println(result);
    }
}
