package Array;

import java.util.Scanner;

// 최대 길이 연속부분수열(복합 문제)
public class MaxLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int result = 0, cnt = 0, lt = 0;
        for(int rt = 0; rt < n; ++rt) {
            if(arr[rt] == 0) {
                cnt++;
            }
            while(cnt > k) {
                if(arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            result = Math.max(result, rt-lt+1);
        }

        System.out.println(result);
    }
}
