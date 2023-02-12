package Array;

import java.util.Scanner;

// 최대 매출 구하기
public class LargestSales {
    public int solution(int n, int k, int[] arr) {
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
        return result;
    }
    public static void main(String[] args) {
        LargestSales T = new LargestSales();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }
}
