package String;

import java.util.Scanner;

// 중복문자 제거
// indexOf -> 처음 발견한 문자의 인덱스 번호
public class RemoveDupl {
    public String solution(String str) {
        String result = "";
        for(int i = 0; i < str.length(); ++i) {
            if(str.indexOf(str.charAt(i)) == i) {
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RemoveDupl T = new RemoveDupl();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
