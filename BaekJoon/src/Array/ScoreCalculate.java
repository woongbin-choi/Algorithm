package Array;

import java.util.Scanner;

// 점수 계산하기
public class ScoreCalculate {
    public int solution(int n, int[] arr){
        int result = 0;
        int cnt = 0;
        for(int i = 0; i < n; ++i) {
            if(arr[i] == 1) {
                cnt++;
                result += cnt;
            } else {
                cnt = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ScoreCalculate T = new ScoreCalculate();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
