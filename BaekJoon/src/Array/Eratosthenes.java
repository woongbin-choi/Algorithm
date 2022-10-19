package Array;

import java.util.Scanner;

// 소수(에라토스테네스 체)
public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int[] ch = new int[n+1];

        for(int i = 2; i <= n; ++i){
            if(ch[i] == 0) {
                result++;
                for(int j = i; j <= n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }

        System.out.println(result);
    }
}
