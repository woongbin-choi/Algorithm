package String;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == c){
                count++;
            }
        }

        System.out.println(count);
    }
}
