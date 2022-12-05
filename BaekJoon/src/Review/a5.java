package Review;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String result = String.valueOf(c);
        System.out.println(result);
    }
}
