package Array;

import java.util.Scanner;

// 격자판 봉우리
public class Peak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int result = 0;

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                boolean flag = true;
                for(int k = 0; k < 4; ++k){
                    int nx = i +dx[k];
                    int ny = j +dy[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) result++;
            }
        }
        System.out.println(result);
    }
}
