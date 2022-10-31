package Array;

import java.util.Scanner;

// 최대 매출 구하기
public class LargestSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int result = 0, sum = 0;
        for(int i = 0; i < k; ++i) {
            sum += arr[i];
        }
        result = sum;

        for(int i = k; i < n; ++i) {
            sum += arr[i];
            sum -= arr[i-k];
            sum = Math.max(result, sum);
        }
        System.out.println(result);
    }
}
