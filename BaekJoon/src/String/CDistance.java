package String;

import java.util.Scanner;

// 가장 짧은 문자거리
public class CDistance {
    public int[] solution(String s, char t) {
        int[] result = new int[s.length()];
        int p = 1000;
        for(int i=0; i < s.length(); ++i){
            if(s.charAt(i) == t){
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = p;
            }
        }

        p = 1000;
        for(int i = s.length()-1; i >= 0; --i){
            if(s.charAt(i) == t){
                p = 0;
            } else {
                p++;
                result[i] = Math.min(result[i], p);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        CDistance T = new CDistance();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : T.solution(str,c)){
            System.out.print(x + " ");
        }
    }
}
