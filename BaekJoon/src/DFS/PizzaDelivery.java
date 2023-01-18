package DFS;

import java.util.ArrayList;
import java.util.Scanner;

// 피자 배달거리
public class PizzaDelivery {
    static int n, m, pzSize, result=Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<PizzaDeliveryPoint> pz, home;

    public void DFS(int L, int s) {
        if(L == m) {
            int sum = 0;
            for(PizzaDeliveryPoint h : home) {
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            result = Math.min(result, sum);
        } else {
            // 조합
            for(int i = s; i < pzSize; ++i) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        PizzaDelivery T = new PizzaDelivery();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        home = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <n; ++j) {
                int tmp = sc.nextInt();
                if(tmp == 1) {
                    home.add(new PizzaDeliveryPoint(i,j));
                } else if (tmp == 2) {
                    pz.add(new PizzaDeliveryPoint(i,j));
                }
            }
        }
        pzSize = pz.size();
        combi = new int[m];
        T.DFS(0,0);
        System.out.println(result);
    }
}
class PizzaDeliveryPoint {
    public int x, y;
    PizzaDeliveryPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}