package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 섬나라 아일랜드
public class IslandBFS {
    static int result = 0, n;
    static int[] dx = {-1, -1, 0 ,1 ,1 ,1, 0, -1};
    static int[] dy = {0 ,1 ,1 ,1, 0, -1, -1, -1};
    Queue<IslandPoint> Q = new LinkedList<>();
    public void BFS(int x, int y, int[][] board) {
        Q.add(new IslandPoint(x, y));
        while(!Q.isEmpty()) {
            IslandPoint pos = Q.poll();
            for(int i = 0; i < 8; ++i) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n
                        && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.add(new IslandPoint(nx, ny));
                }
            }
        }
    }
    public void solution(int[][] board) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(board[i][j] == 1) {
                    result++;
                    board[i][j] = 0;
                    BFS(i , j ,board);
                }
            }
        }
    }
    public static void main(String[] args) {
        IslandBFS T = new IslandBFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(result);
    }
}
class IslandPoint {
    int x, y;
    IslandPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
