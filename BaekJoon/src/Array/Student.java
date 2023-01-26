package Array;

import java.util.Scanner;

// 보이는 학생
public class Student {
    public int solution(int n, int[] arr) {
        int max = 0;
        int result = 0;

        for (int i = 0; i < n; ++i){
            if(arr[i] > max) {
                result++;
                max = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Student T = new Student();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
