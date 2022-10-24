package Array;

import java.util.Scanner;

// 등수 구하기
public class Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        for(int i = 0; i< n; ++i) {
            int cnt = 1;
            for(int j = 0; j < n; ++j) {
                if(arr[j] > arr[i]) {
                    cnt++;
                }
            }
            result[i] = cnt;
        }

        System.out.println(result);
    }
}
