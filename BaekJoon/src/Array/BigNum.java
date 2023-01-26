package Array;

import java.util.ArrayList;
import java.util.Scanner;

// 큰 수 출력하기
public class BigNum {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i = 1; i < n; ++i){
            if(arr[i] > arr[i-1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        BigNum T = new BigNum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }

        for(int x : T.solution(n,arr)) {
            System.out.println(x);
        }
    }
}
