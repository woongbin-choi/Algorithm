package Array;

import java.util.Scanner;

// 피보나치 수열
// 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
public class Fibonacci {
    public int[] solution(int n){
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < n; ++i){
            result[i] = result[i-2] + result[i-1];
        }
        return result;
    }
    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : T.solution(n)) {
            System.out.println(x);
        }
    }
}
