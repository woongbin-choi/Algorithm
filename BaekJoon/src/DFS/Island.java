package DFS;

import java.util.Scanner;

// 섬나라 아일랜드
public class Island {
    static int result = 0, n;
    static int[] dx = {-1, -1, 0 ,1 ,1 ,1, 0, -1};
    static int[] dy = {0 ,1 ,1 ,1, 0, -1, -1, -1};

    public static void main(String[] args) {
        Island T = new Island();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n ; ++i) {
            for(int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(result);
    }
    public void solution(int[][] board) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(board[i][j] == 1) {
                    result++;
                    board[i][j] = 0; // 출발점 0으로 초기화
                    DFS(i, j, board);
                }
            }
        }
    }
    public void DFS(int x, int y, int[][] board) {
        for(int i = 0; i < 8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n
                    && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }


}
