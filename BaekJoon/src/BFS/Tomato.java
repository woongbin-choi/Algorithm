package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 토마토(BFS)
public class Tomato {
    static int[] dx = {-1, 0 ,1 ,0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, date;
    static int n, m;
    static Queue<TomatoPoint> Q = new LinkedList<>();

    public void BFS() {
        while(!Q.isEmpty()) {
            TomatoPoint tmp = Q.poll();
            for(int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m
                        && board[nx][ny] ==0) {
                    board[nx][ny] = 1;
                    Q.offer(new TomatoPoint(nx, ny));
                    date[nx][ny] = date[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Tomato T = new Tomato();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); // 열
        n = sc.nextInt(); // 행
        board = new int[n][m];
        date = new int[m][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) {
                    Q.offer(new TomatoPoint(i, j));
                }
            }
        }
        T.BFS();
        boolean flag = true;
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(board[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if(flag) {
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    result = Math.max(result, date[i][j]);
                }
            }
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}

class TomatoPoint {
    public int x,y;
    TomatoPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
