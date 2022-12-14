package RecursiveTreeGraph;

// 이진수 출력(재귀)
public class Binary {
    public static void main(String[] args) {
        Binary T = new Binary();
        T.DFS(11);
    }

    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }
}
