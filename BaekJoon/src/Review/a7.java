package Review;

import java.util.Scanner;

public class a7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "YES";
        if(str.length()%2 != 0) {
            result = "NO";
        }

        str = str.toUpperCase().replaceAll("^[A-Z]]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equals(tmp)) {
            result = "NO";
        }
        System.out.println(result);
    }
}
