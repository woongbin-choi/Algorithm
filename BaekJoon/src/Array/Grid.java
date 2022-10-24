package Array;

import java.util.Scanner;

// 격자판 최대합
public class Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = Integer.MIN_VALUE;
        int sum1,sum2;
        for(int i = 0; i < n; ++i){
            sum1 = 0;
            sum2 = 0;
            for(int j = 0; j < n; ++j){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }
        sum1 = 0;
        sum2 = 0;

        for(int i = 0; i < n; ++i) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        result = Math.max(result, sum1);
        result = Math.max(result, sum2);

        System.out.println(result);
    }
}
