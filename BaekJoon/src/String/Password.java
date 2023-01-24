package String;

import java.util.Scanner;

// 암호 (replace(), parseInt(string, 2))
public class Password {
    public String solution(int n, String str) {
        String result = "";
        for(int i = 0; i < n; ++i){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            result += (char)num;
            str = str.substring(7);
        }
        return result;
    }
    public static void main(String[] args) {
        Password T = new Password();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
