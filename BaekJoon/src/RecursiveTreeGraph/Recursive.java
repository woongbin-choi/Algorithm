package RecursiveTreeGraph;

// 재귀함수(스택프레임)
public class Recursive {
    public static void main(String[] args) {
        Recursive T = new Recursive();
        T.DFS(3);
    }

    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            DFS(n-1);
        }
    }
}
