package String;

import java.util.Scanner;

// 대소문자 변환
// 단어 하나 주어지면 대 -> 소, 소 -> 대 로 변환
public class Conversion {
    public String solution(String str) {
        String result = "";

        for(char c : str.toCharArray()) {
            if (Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }

//            if (c >= 97 && c <= 122) {
//                result += (char)(c-32);
//            } else {
//                result += (char)(c+32);
//            }
        }
        return result;
    }
    public static void main(String[] args) {
        Conversion T = new Conversion();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
