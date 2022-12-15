package RecursiveTreeGraph;

// 피보나치 수열
public class Fibonacci {
    static int[] fibo;
    public int DFS(int n) {
        if(fibo[n] > 0) {
            return fibo[n];
        }

        if(n==1) {
            return fibo[n] = 1;
        } else if (n ==2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        int n = 40;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i = 1; i <= n; ++i) {
            System.out.print(fibo[i] + " ");
        }
    }

//    public int DFS(int n) {
//        if(n==1) {
//            return 1;
//        } else if (n ==2) {
//            return 1;
//        } else {
//            return DFS(n-2) + DFS(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Fibonacci T = new Fibonacci();
//        int n = 40;
//        for(int i = 1; i <= n; ++i) {
//            System.out.print(T.DFS(i) + " ");
//        }
//    }


}
