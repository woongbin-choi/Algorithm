package String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기, StringBuilder, 일일이 뒤집기
public class ReverseWord {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> result = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            result.add(tmp);
        }
//        일일이 뒤집기(특정 글자만 바꿀수 있다)
//        ArrayList<String> result2 = new ArrayList<>();
//        for(String z : str) {
//            char[] s = z.toCharArray();
//            int lt = 0;
//            int rt = z.length() -1;
//
//            while(lt < rt) {
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//            String anwser = String.valueOf(s);
//            result2.add(anwser);
//        }
        return result;
    }
    public static void main(String[] args) {
        ReverseWord T = new ReverseWord();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i= 0; i<n; ++i){
            str[i] = sc.next();
        }
        for(String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }

}
