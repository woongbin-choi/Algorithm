package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 공통 원소 구하기
public class TwoPointers2 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if(a[p1] == b[p2]) {
                result.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TwoPointers2 T = new TwoPointers2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; ++i){
            b[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,m,a,b));
    }
}
