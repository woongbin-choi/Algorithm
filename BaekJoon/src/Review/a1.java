package Review;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Character c = sc.next().charAt(0);

        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        int result = 0;

        for(Character x : str.toCharArray()) {
            if(x == c) {
                result++;
            }
        }

        System.out.println(result);
    }
}
