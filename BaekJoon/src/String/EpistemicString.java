package String;

import java.util.Scanner;

// 회문 문자열 (대소문자 구분X)
public class EpistemicString {
    public String solution(String str) {
        str = str.toUpperCase();
        String result = "YES";
        int len = str.length();

        for(int i = 0; i < len/2; ++i){
            if(str.charAt(i) != str.charAt(len -i - 1)){
                result = "NO";
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        EpistemicString T = new EpistemicString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
