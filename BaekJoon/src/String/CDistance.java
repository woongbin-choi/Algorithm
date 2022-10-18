package String;

import java.util.Scanner;

// 가장 짧은 문자거리
public class CDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        int[] result = new int[str.length()];
        int p = 1000;
        for(int i=0; i < str.length(); ++i){
            if(str.charAt(i) == c){
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = p;
            }
        }

        p = 1000;
        for(int i = str.length()-1; i >0; --i){
            if(str.charAt(i) == c){
                p = 0;
            } else {
                p++;
                result[i] = Math.min(result[i], p);
            }
        }

        for(int x : result){
            System.out.println(x);
        }
    }
}
