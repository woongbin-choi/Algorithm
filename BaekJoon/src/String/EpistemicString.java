package String;

import java.util.Scanner;

// 회문 문자열 (대소문자 구분X)
public class EpistemicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();

        String result = "YES";
        int len = str.length();

        for(int i = 0; i < len/2; ++i){
            if(str.charAt(i) != str.charAt(len -i - 1)){
                result = "NO";
                break;
            }
        }

        System.out.println(result);
    }
}
