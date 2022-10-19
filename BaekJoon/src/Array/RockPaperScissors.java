package Array;

import java.util.Scanner;

// 가위바위보
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; ++i){
            b[i] = sc.nextInt();
        }

        String result = "";

        for(int i = 0; i < n; ++i){
            if(a[i] == b[i]) {
                result += "D";
            } else if (a[i] == 1 && b[i] == 3) {
                result += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                result += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                result += "A";
            } else {
                result += "B";
            }
        }

        for(char x : result.toCharArray()) {
            System.out.println(x);
        }
    }
}
