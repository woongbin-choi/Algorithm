package String;

import java.util.Scanner;

// 대소문자 변환
public class Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";

        for(char c : str.toCharArray()) {
            if (Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }

        System.out.println(result);
    }
}
