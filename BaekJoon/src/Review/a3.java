package Review;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int max = Integer.MIN_VALUE;
        int pos = 0;
        String result = "";

        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > max) {
                max = len;
                result = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) {
            result = str;
        }
        System.out.println(result);
    }
}
