package String;

import java.util.Scanner;

// 중복문자 제거
// indexOf -> 처음 발견한 문자의 인덱스 번호
public class RemoveDupl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(int i = 0; i < str.length(); ++i){
            if(str.indexOf(i) == i) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
