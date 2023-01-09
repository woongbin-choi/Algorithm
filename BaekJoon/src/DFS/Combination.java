package DFS;

import java.util.Scanner;

// 조합의 경우 수(메모이제이션)
public class Combination {
    int[][] dy = new int[35][35];
    public int DFS(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
    public static void main(String[] args) {
        Combination T = new Combination();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
