package Array;

import java.util.Scanner;

// 연속된 자연수의 합(수학적으로 풀이)
public class ContinuousSumMath {
    public int solution(int n) {
        int result = 0, cnt = 1;
        n--;
        while(n > 0) {
            cnt++;
            n -= cnt;
            if(n % cnt == 0) {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ContinuousSumMath T = new ContinuousSumMath();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
