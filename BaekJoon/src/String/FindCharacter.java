package String;

import java.util.Scanner;

/* 문자 찾기
단어 속 대소문자 구분없이 문자 찾기
*/
public class FindCharacter {
    public int solution(String str, char c) {
        int result = 0;
        for(char x : str.toCharArray()) {
            if (x == c) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        FindCharacter T = new FindCharacter();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        System.out.println(T.solution(str, c));
    }
}
