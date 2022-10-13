package String;

import java.util.Scanner;

// 특정 문자 뒤집기
public class SpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

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
        String result = "";
        result = String.valueOf(s);
        System.out.println(result);
    }
}
