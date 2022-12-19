package RecursiveTreeGraph;

public class FibonacciArray {
    public static void main(String[] args) {
        int n = 10;
        int[] result = new int[n];

        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < n; ++i) {
            result[i] = result[i - 2] + result[i - 1];
        }

        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
