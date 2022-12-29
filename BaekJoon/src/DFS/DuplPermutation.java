package DFS;

import java.util.Scanner;

// 중복순열
public class DuplPermutation {
    static int[] pm;
    static int n,m;
    public void DFS(int L) {
        if(L == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = 1; i <= n; ++i) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {
        DuplPermutation T = new DuplPermutation();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
