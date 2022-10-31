package Array;

import java.util.ArrayList;
import java.util.Scanner;

// 두 배열 합치기
public class TwoPointers {
    public static void main(String[] args) {
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

        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if(a[p1] < b[p2]) {
                result.add(a[p1++]);
            } else {
                result.add(b[p2++]);
            }
        }
        while(p1<n) {
            result.add(a[p1++]);
        }
        while(p2<m) {
            result.add(b[p2++]);
        }

        System.out.println(result);
    }
}
