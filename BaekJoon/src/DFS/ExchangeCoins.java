package DFS;

import java.util.Scanner;

// 동전 교환
public class ExchangeCoins {
    static int n, m, result = Integer.MAX_VALUE;
    public void DFS(int L, int sum, int[] arr) {
        if(sum > m) return;
        if(sum == m) {
            result = Math.min(result, L);
        } else {
            for(int i = 0; i < n; ++i) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }
    public static void main(String[] args) {
     ExchangeCoins T = new ExchangeCoins();
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     int[] arr = new int[n];
     for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextInt();
     }
     m = sc.nextInt();
     T.DFS(0,0,arr);
     System.out.println(result);
    }
}
