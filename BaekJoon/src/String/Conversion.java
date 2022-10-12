package String;

import java.util.Scanner;

// 대소문자 변환
// 단어 하나 주어지면 대 -> 소, 소 -> 대 로 변환
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

            if (c >= 97 && c <= 122) {
                result += (char)(c-32);
            } else {
                result += (char)(c+32);
            }
        }

        System.out.println(result);
    }
}
