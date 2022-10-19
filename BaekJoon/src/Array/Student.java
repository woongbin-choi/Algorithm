package Array;

import java.util.Scanner;

// 보이는 학생
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int result = 0;

        for (int i = 0; i < n; ++i){
            if(arr[i] > max) {
                result++;
                max = arr[i];
            }
        }

        System.out.println(result);
    }
}
