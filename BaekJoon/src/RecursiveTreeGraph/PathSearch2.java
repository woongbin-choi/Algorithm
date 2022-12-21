package RecursiveTreeGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 경로탐색(인접리스트)
public class PathSearch2 {
    static int n, m, result = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v) {
        if(v == n) result++;
        else {
            for(int nv : graph.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        PathSearch2 T = new PathSearch2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; ++i) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0; i < m; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(result);

    }
}
