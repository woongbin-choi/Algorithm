package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 응급실
public class EmergencyRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int result = 1;

        Queue<Person> Q = new LinkedList<>();
        for(int i = 0; i < n; ++i) {
            Q.offer(new Person(i, arr[i]));
        }
        while(!Q.isEmpty()) {
            Person tmp = Q.poll();
            for(Person x : Q) {
                if(x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null) {
                if(tmp.id != m) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
