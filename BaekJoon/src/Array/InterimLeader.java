package Array;

import java.util.Scanner;

// 임시 반장 정하기
public class InterimLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 1; i < n; ++i){
            for(int j = 1; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0, max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; ++i) {
            int cnt = 0;
            for(int j = 1; j <= n; ++j) {
                for(int k = 1; k <= 5; ++k) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > max) {
                max = cnt;
                result = i;
            }
        }

        System.out.println(result);
    }
}
