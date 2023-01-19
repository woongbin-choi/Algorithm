package String;

import java.util.Scanner;

// 특정 문자 뒤집기
public class SpecificChar {
    public String solution(String str){
        String result = "";
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt <  rt) {
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        result = String.valueOf(s);
        return result;
    }
    public static void main(String[] args) {
        SpecificChar T = new SpecificChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
