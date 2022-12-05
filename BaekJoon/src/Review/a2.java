package Review;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";
        for(char x : str.toCharArray()) {
            if(x >= 97 && x <= 122) {
                result += (char)(x-32);
            } else {
                result += (char)(x+32);
            }
        }
        System.out.print(result);
    }
}
