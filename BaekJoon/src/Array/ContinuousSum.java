package Array;

import java.util.Scanner;

// 연속된 자연수의 합(two pointers)
public class ContinuousSum {
    public int solution(int n) {
        int result = 0, sum = 0, lt = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];
        for(int i = 0; i < m; ++i) {
            arr[i] = i + 1;
        }

        for(int rt = 0; rt < m; ++rt) {
            sum += arr[rt];
            if(sum == n) {
                result++;
            }
            while(sum >= n) {
                sum -= arr[lt];
                lt++;
                if(sum == n) {
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ContinuousSum T = new ContinuousSum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
