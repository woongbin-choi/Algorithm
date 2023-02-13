package Array;

import java.util.Scanner;

//  연속 부분 수열(복합적 문제)
public class ContinuousSequence {
    public int solution(int n, int m, int[] arr){
        int result = 0, sum = 0, lt = 0;
        for(int rt = 0; rt < n; ++rt) {
            sum += arr[rt];
            if (sum == m) {
                result++;
            }
            while(sum >= m) {
                sum -= arr[lt];
                lt++;
                if (sum == m) {
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ContinuousSequence T = new ContinuousSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
