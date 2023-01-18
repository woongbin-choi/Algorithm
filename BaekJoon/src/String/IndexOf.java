package String;

import java.util.Scanner;

// 문장 속 단어
// 한개 의 문장 속 가장 긴 단어를 출력 (가장 앞쪽에 위치한 단어)
public class IndexOf {
    public String solution(String str) {
        String result = "";
        int max = Integer.MIN_VALUE, pos;

        while((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);

            int len = tmp.length();
            if(len > max) {
                max = len;
                result = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) {
            result = str;
        }

//        String[] arr = str.split(" ");
//        for (String s : arr){
//            int len = s.length();
//            if (len > max) {
//                max = len;
//                result = s;
//            }
//        }
        return result;
    }
    public static void main(String[] args) {
        IndexOf T = new IndexOf();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
