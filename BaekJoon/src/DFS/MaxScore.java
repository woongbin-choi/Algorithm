package DFS;

import java.util.Scanner;

// 최대 점수 구하기
public class MaxScore {
    static int result = Integer.MIN_VALUE, n, m;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(time > m) return;
        if(L == n) {
            result = Math.max(result, sum);
        } else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        MaxScore T = new MaxScore();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(result);
    }
}
