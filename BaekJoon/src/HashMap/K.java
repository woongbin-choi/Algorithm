package HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// k번째 큰 수
public class K {
    public int solution(int n, int k, int[] arr){
        int result = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; ++i) {
            for(int j = i+1; j < n; ++j) {
                for(int l = j+1; l < n; ++l) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset) {
            cnt++;
            if(cnt == k) {
                result = x;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        K T = new K();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }
}
