package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 교육과정설계
public class CourseOfStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String result = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char x : a.toCharArray()) {
            Q.offer(x);
        }

        for(char y : b.toCharArray()) {
            if(Q.contains(y)) {
                if(y != Q.poll()) {
                    result = "NO";
                    break;
                }
            }
        }
        if(!Q.isEmpty()) {
            result = "NO";
        }

        System.out.println(result);
    }
}
