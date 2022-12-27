package DFS;

import java.util.Scanner;

// 최대 무게 구하기
public class MaxWeight {
    static int result = Integer.MIN_VALUE, c, n;
    public void DFS(int L, int sum, int[] arr) {
        if(sum > c) return;
        if(L == n) {
            result = Math.max(result, sum);
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        MaxWeight T = new MaxWeight();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(result);
    }
}
