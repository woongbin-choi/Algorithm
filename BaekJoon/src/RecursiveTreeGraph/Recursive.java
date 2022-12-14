package RecursiveTreeGraph;

import java.util.Scanner;

// 재귀함수(스택프레임)
public class Recursive {
    public static void main(String[] args) {
        Recursive T = new Recursive();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.DFS(n);
    }

    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
}
