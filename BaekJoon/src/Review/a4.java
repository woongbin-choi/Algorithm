package Review;

import java.util.ArrayList;
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; ++i) {
            str[i] = sc.next();
        }

        String result = "";
        for(String s : str) {
            char[] z = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;
            while(lt < rt) {
                char tmp = z[lt];
                z[lt] = z[rt];
                z[rt] = tmp;
                lt++;
                rt--;
            }
            result = String.valueOf(z);
            System.out.println(result);
        }
    }
}
