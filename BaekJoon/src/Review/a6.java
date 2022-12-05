package Review;

import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";
        for(int i = 0; i < str.length(); ++i) {
            if(str.indexOf(str.charAt(i)) == i) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
