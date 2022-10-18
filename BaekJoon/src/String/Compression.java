package String;

import java.util.Scanner;

// 문자열 압축
public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";
        str += " ";
        int cnt = 1;

        for(int i = 0; i < str.length()-1; ++i){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            } else {
              result += str.charAt(i);
              if(cnt > 1) {
                  result += String.valueOf(cnt);
                  cnt = 1;
              }
            }
        }

        System.out.println(result);
    }
}
