package RecursiveTreeGraph;

// 팩토리얼
public class Factorial {
    public static void main(String[] args) {
        Factorial T = new Factorial();
        System.out.println(T.DFS(5));
    }
    public int DFS(int n) {
        if(n==1) return 1;
        else return n*DFS(n-1);
    }
}
